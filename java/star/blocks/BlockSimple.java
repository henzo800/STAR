package star.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;

/**
 * User: The Grey Ghost
 * Date: 24/12/2014
 *
 * BlockSimple is a ordinary solid cube with the six faces numbered from 0 - 5.
 * For background information on blocks see here http://greyminecraftcoder.blogspot.com/2020/02/blocks-1144.html
 *
 * For a couple of the methods below the Forge guys have marked it as deprecated.  But you still need to override those
 *   "deprecated" block methods.  What they mean is "when you want to find out what is a block's getRenderType(),
 *     don't call block.getRenderType(), call blockState.getRenderType() instead".
 * If that doesn't make sense to you yet, don't worry.  Just ignore the "deprecated method" warning.
 *
 */
public class BlockSimple extends Block
{
	public static final String REG = "star_b01_simple_block";
  public BlockSimple()
  {
    super(Block.Properties.create(Material.ROCK)  // look at Block.Properties for further options
            // typically useful: hardnessAndResistance(), harvestLevel(), harvestTool()
         );
    
  }
  

  // render using a BakedModel (mbe01_block_simple.json --> mbe01_block_simple_model.json)
  // not strictly required because the default (super method) is MODEL.
  @Override
  public BlockRenderType getRenderType(BlockState blockState) {
    return BlockRenderType.MODEL;
  }
  
  @Override
  public void onPlayerDestroy(IWorld worldIn, BlockPos pos, BlockState state) {
	  worldIn.setBlockState(pos, Blocks.DIAMOND_BLOCK.getDefaultState(), 1);
  }
  
  
}
