/* 
 * Copyright 2019 Javier Monterde - javier.monterde.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Javier Monterde - javier.monterde.alum@iescamp.es
 */
public class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {
        //Constantes
        final String bisiesto;

        //Variables
        int anyo;

        //Salida inicial
        System.out.println("Alternativa Bisiesta");
        System.out.println("====================");

        //Bloque principal
        try {
            //Esperamos a la respuesta del usuario
            System.out.print("Análisis año ...: ");
            anyo = SCN.nextInt();
            SCN.nextLine();

            //Comprobamos si es bisiesto
            if (anyo < 0) {
                bisiesto = "NO";
                System.out.println("Valor negativo.");
            } else if (anyo % 400 == 0) {
                bisiesto = "SI";
            } else if (anyo % 100 == 0) {
                bisiesto = "NO";
            } else if (anyo % 4 == 0) {
                bisiesto = "SI";
            } else {
                bisiesto = "NO";
            }

            //Salida final
            System.out.println("---");
            System.out.printf("El año %d ....: %s es bisiesto.%n",
                    anyo, bisiesto);
        } catch (Exception e) {
            //En caso de entrada no válida, mostraremos esto por pantalla
            System.out.println("ERROR: Entrada incorrecta.");
        }

    }
}
