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
package fr.ird.akado.core.common;

/**
 * Représente le résultat d'un controle. Il doit etre déclinée en fonction des
 * applications logicielles (ERS, AVDTH,...).
 *
 * @author Julien Lebranchu <julien.lebranchu@ird.fr>
 * @param <T> le type du résultat
 * @since 2.0
 * @date 9 juil. 2014
 *
 * $LastChangedDate$
 *
 * $LastChangedRevision$
 */
public abstract class AbstractResult<T> {

    private T t;

    public T get() {
        return t;
    }

    public void set(T t) {
        this.t = t;
    }

    protected AkadoMessage message;

    public AkadoMessage getMessage() {
        return message;
    }

//    {
//        if (message == null) {
//            ArrayList tmp = getMessageParameters();
//            String type = "E";
//            if (messageType != null && !"".equals(messageType)) {
//                type = messageType.toUpperCase().substring(0, 1);
//            }
//            tmp.add(0, type + messageCode);
//            message = new Message(messageCode, messageLabel, tmp, messageType);
//        }
//        return message;
//    }
}
