package star.events;

import net.minecraft.entity.item.ItemEntity;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.item.ItemTossEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import star.Main;

@Mod.EventBusSubscriber(modid = Main.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class ClientEvents {
	
	
	@SubscribeEvent
	public static void onItemToss(ItemTossEvent event) {
		if(event.getEntityItem().getItem().getItem() instanceof star.items.BlockSimple) {
			ItemEntity oldEntity = event.getEntityItem();
			Vector3d pos = oldEntity.getPositionVec();
			star.entitys.BlockSimple newEntity = new star.entitys.BlockSimple(oldEntity.world, pos.getX(), pos.getY(), pos.getZ(), oldEntity.getItem().getStack());
			newEntity.setMotion(oldEntity.getMotion());
			newEntity.moveForced(pos);
			newEntity.setDefaultPickupDelay();
			oldEntity.remove(true);
			oldEntity.getEntityWorld().addEntity(newEntity);
		}
	}
	
}
