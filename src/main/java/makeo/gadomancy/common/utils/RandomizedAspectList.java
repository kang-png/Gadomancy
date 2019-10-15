package makeo.gadomancy.common.utils;

import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * This class is part of the Gadomancy Mod
 * Gadomancy is Open Source and distributed under the
 * GNU LESSER GENERAL PUBLIC LICENSE
 * for more read the LICENSE file
 *
 * Created by HellFirePvP @ 18.12.2015 13:58
 */
public class RandomizedAspectList extends AspectList {

    private static final Random RANDOM = new Random();
    private Map<Aspect, Integer> aspectMap = new HashMap<Aspect, Integer>();
    private long lastRandomization;
    private boolean halfCap;

    public RandomizedAspectList addAspectRandomBase(Aspect aspect, int amount) {
        this.aspectMap.put(aspect, amount);
        return this;
    }

    public RandomizedAspectList setHalfCap(boolean halfCap) {
        this.halfCap = halfCap;
        return this;
    }

    private void checkRandomization() {
        if((System.currentTimeMillis() - this.lastRandomization) > 500) {
            super.aspects.clear();
            for(Aspect a : this.aspectMap.keySet()) {
                if(a == null) continue;
                int am;
                if(this.halfCap) {
                    int c = this.aspectMap.get(a);
                    am = (c / 2) + RandomizedAspectList.RANDOM.nextInt(c / 2);
                } else {
                    am = RandomizedAspectList.RANDOM.nextInt(this.aspectMap.get(a));
                }
                if(am > 0) {
                    super.add(a, am);
                }
            }
            this.lastRandomization = System.currentTimeMillis();
        }
    }

    @Override
    public Aspect[] getAspects() {
        this.checkRandomization();
        return super.getAspects();
    }

    @Override
    public Aspect[] getAspectsSorted() {
        this.checkRandomization();
        return super.getAspectsSorted();
    }

    @Override
    public Aspect[] getAspectsSortedAmount() {
        this.checkRandomization();
        return super.getAspectsSortedAmount();
    }

    @Override
    public int getAmount(Aspect key) {
        this.checkRandomization();
        return super.getAmount(key);
    }

    @Override
    public Aspect[] getPrimalAspects() {
        this.checkRandomization();
        return super.getPrimalAspects();
    }

}
