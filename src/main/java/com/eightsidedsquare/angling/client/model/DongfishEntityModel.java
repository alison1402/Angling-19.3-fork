package com.eightsidedsquare.angling.client.model;

import com.eightsidedsquare.angling.common.entity.DongfishEntity;
import com.eightsidedsquare.angling.core.AnglingUtil;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;

import static com.eightsidedsquare.angling.core.AnglingMod.MOD_ID;

public class DongfishEntityModel extends BasicEntityModel<DongfishEntity> {

    public DongfishEntityModel() {
        super("dongfish", true);
    }

    @Override
    public void setLivingAnimations(DongfishEntity entity, Integer uniqueID, AnimationEvent customPredicate) {
        super.setLivingAnimations(entity, uniqueID, customPredicate);
        if(!AnglingUtil.isReloadingResources()) {
            IBone scungle = getAnimationProcessor().getBone("scungle");
            if(scungle != null) {
                scungle.setHidden(!entity.hasHorngus());
            }
        }
    }
}
