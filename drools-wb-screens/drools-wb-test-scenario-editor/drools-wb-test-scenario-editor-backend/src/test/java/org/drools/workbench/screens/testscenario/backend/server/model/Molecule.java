/*
 * Copyright 2017 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.drools.workbench.screens.testscenario.backend.server.model;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Molecule implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    private BigInteger countOfAtoms;
    private String name;
    private BigDecimal weightInKilograms;

    private boolean reactable;

    public Molecule() {
    }

    public BigInteger getCountOfAtoms() {
        return this.countOfAtoms;
    }

    public void setCountOfAtoms(BigInteger countOfAtoms) {
        this.countOfAtoms = countOfAtoms;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getWeightInKilograms() {
        return this.weightInKilograms;
    }

    public void setWeightInKilograms(BigDecimal weightInKilograms) {
        this.weightInKilograms = weightInKilograms;
    }

    public boolean isReactable() {
        return this.reactable;
    }

    public void setReactable(boolean reactable) {
        this.reactable = reactable;
    }

    public Molecule(BigInteger countOfAtoms, String name,
                    BigDecimal weightInKilograms, boolean reactable) {
        this.countOfAtoms = countOfAtoms;
        this.name = name;
        this.weightInKilograms = weightInKilograms;
        this.reactable = reactable;
    }

    @Override
    public String toString() {
        return "Molecule{" +
                "countOfAtoms=" + countOfAtoms +
                ", name='" + name + '\'' +
                ", weightInKilograms=" + weightInKilograms +
                ", reactable=" + reactable +
                '}';
    }
}