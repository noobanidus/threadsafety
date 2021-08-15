package noobanidus.mods.falling.mixins;

import net.minecraft.entity.item.FallingBlockEntity;
import net.minecraft.util.math.vector.Vector3d;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(FallingBlockEntity.class)
public class MixinFallingBlockEntity {
  @Redirect(method = "Lnet/minecraft/entity/item/FallingBlockEntity;tick()V", at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/item/FallingBlockEntity;setMotion(Lnet/minecraft/util/math/vector/Vector3d;)V"))
  protected void setMotion(FallingBlockEntity fallingBlockEntity, Vector3d motionIn) {
    fallingBlockEntity.setMotion(fallingBlockEntity.getMotion().add(0, -1.5, 0));
  }
}
