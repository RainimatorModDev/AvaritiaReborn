package com.iafenvoy.avaritia.item.block;

import com.iafenvoy.avaritia.item.block.entity.ExtremeCraftingTableBlockEntity;
import com.iafenvoy.avaritia.registry.AvaritiaBlockEntities;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.BlockWithEntity;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class ExtremeCraftingTableBlock extends BlockWithEntity {
    public ExtremeCraftingTableBlock(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (!world.isClient) {
            NamedScreenHandlerFactory screenHandlerFactory = state.createScreenHandlerFactory(world, pos);
            if (screenHandlerFactory != null)
                player.openHandledScreen(screenHandlerFactory);
        }
        return ActionResult.SUCCESS;
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new ExtremeCraftingTableBlockEntity(pos, state);
    }


    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }

    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
        return checkType(type, AvaritiaBlockEntities.EXTREME_CRAFTING_TABLE, ExtremeCraftingTableBlockEntity::tick);
    }

    @Override
    public void onBreak(World world, BlockPos pos, BlockState state, PlayerEntity player) {
        /*if(world.getBlockEntity(pos) != null){
            NeutronCollectorBlockEntity be = (NeutronCollectorBlockEntity) world.getBlockEntity(pos);
            int i = 0;
            if(be != null){
                DefaultedList<ItemStack> list = be.getItems();
                for(i = 0; i < list.size(); i++){
                    dropStack(world, pos, list.get(i));
                }
            }
        }*/
        super.onBreak(world, pos, state, player);
    }
}
