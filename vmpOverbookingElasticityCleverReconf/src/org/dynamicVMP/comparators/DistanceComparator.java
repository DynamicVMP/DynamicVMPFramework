package org.dynamicVMP.comparators;

import org.dynamicVMP.memeticAlgorithm.FitnessComparator;
import org.dynamicVMP.memeticAlgorithm.Individual;

import java.util.Comparator;

/**
 * @author Leonardo Benitez.
 */
public class DistanceComparator implements FitnessComparator, Comparator<Individual>{

    private final Boolean largerValuesPreferred;

    public DistanceComparator(Boolean largerValuesPreferred){

        this.largerValuesPreferred = largerValuesPreferred;
    }

    @Override
    public int compare(Individual individual1, Individual individual2) {

        if(largerValuesPreferred){
            return Double.compare(individual1.getFitness(),individual2.getFitness()) * -1;
        }else{
            return Double.compare(individual1.getFitness(),individual2.getFitness());
        }

    }
}
