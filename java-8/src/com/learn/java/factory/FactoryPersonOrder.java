package com.learn.java.factory;

import com.learn.java.data.Person;
import com.learn.java.enums.PersonOrderTypeEnum;
import com.learn.java.interfaces.IPersonOrder;

import java.util.Comparator;
import java.util.Optional;

public class FactoryPersonOrder{

    public static Optional<Comparator<Person>> getPersonOrder(PersonOrderTypeEnum orderType) {
        switch (orderType) {
            case Name: {
                return Optional.of(IPersonOrder.nameOrder());
            }
            case LastName: {
                return Optional.of(IPersonOrder.lastNameOrder());
            }
            case Age: {
                return Optional.of(IPersonOrder.ageOrder());
            }
            default: {
                return Optional.empty();
            }
        }
    }
}
