/*
 * $Id$
 *
 * Copyright (C) 2014 Observatoire thonier, IRD
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package fr.ird.akado.core;

import fr.ird.akado.core.common.AkadoMessages;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe mettant en scène les différents composants nécessaires à la validation
 * des bases.
 *
 * @author Julien Lebranchu <julien.lebranchu@ird.fr>
 * @since 2.0
 * @date 21 mai 2014
 *
 * $LastChangedDate$
 *
 * $LastChangedRevision$
 */
public class AkadoCore {

    private List<DataBaseInspector> dataBaseValidators;
    private final AkadoMessages akadoMessages;

    public AkadoCore() {
        dataBaseValidators = new ArrayList<>();
        akadoMessages = new AkadoMessages();

//        AkadoProperties.getService().init();
    }

    public List<DataBaseInspector> getDataBaseValidator() {
        return dataBaseValidators;
    }

    public void setDataBaseValidator(List<DataBaseInspector> dataBaseValidators) {
        this.dataBaseValidators = dataBaseValidators;
    }

    public boolean addDataBaseValidator(DataBaseInspector dataBaseValidator) {
        return this.dataBaseValidators.add(dataBaseValidator);
    }

    public void execute() throws Exception {
        for (DataBaseInspector baseValidator : getDataBaseValidator()) {
            baseValidator.validate();
        }
    }

}
