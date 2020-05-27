package Ejercisio4;

import java.util.Scanner;

public class Ejercisio4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int año;
        int mes;
        String mes1;
        int dia;
        String dia1;

        System.out.println(" digitar la fecha ");
        año = entrada.nextInt();
        if ((año % 4 == 0) && ((año % 100 != 0) || (año % 400 == 0))) {
            System.out.println("El año es bisiesto");
            System.out.println(" por favor introducir el mes ");
            mes = entrada.nextInt();

            if (mes == 1) {
                System.out.println("el numero del mes es " + mes);
                System.out.println(" el mes es enero");
                System.out.println(" por favor introducir el dia");
                dia = entrada.nextInt();

                if ((dia >= 1) && (dia <= 31)) {
                    System.out.println(" el numero del dia es " + dia);
                    System.out.println(" el nombre del mes es : enero");
                    System.out.println(" el numero del mes es " + mes);
                    System.out.println(" el numero del año es " + año);

                } else {
                    System.out.println(" no cumple el dia");
                }

            } else if (mes == 2) {
                System.out.println("el numero del mes es " + mes);
                System.out.println(" el mes es febrero");
                System.out.println(" por favor introducir el dia");
                dia = entrada.nextInt();

                if ((dia >= 1) && (dia <= 29)) {
                    System.out.println(" el numero del dia es " + dia);
                    System.out.println(" el nombre del mes es :febrero ");
                    System.out.println(" el numero del mes es " + mes);
                    System.out.println(" el numero del año es " + año);

                } else {
                    System.out.println(" no cumple el dia");
                }

            } else if (mes == 3) {
                System.out.println("el numero del mes es " + mes);
                System.out.println(" el mes es marzo");
                System.out.println(" por favor introducir el dia");
                dia = entrada.nextInt();

                if ((dia >= 1) && (dia <= 31)) {
                    System.out.println(" el numero del dia es " + dia);
                    System.out.println(" el nombre del mes es : marzo");
                    System.out.println(" el numero del mes es " + mes);
                    System.out.println(" el numero del año es " + año);

                } else {
                    System.out.println(" no cumple el dia");
                }

            } else if (mes == 4) {
                System.out.println("el numero del mes es " + mes);
                System.out.println(" el mes es abril");
                System.out.println(" por favor introducir el dia");
                dia = entrada.nextInt();

                if ((dia >= 1) && (dia <= 30)) {
                    System.out.println(" el numero del dia es " + dia);
                    System.out.println(" el nombre del mes es : abril");
                    System.out.println(" el numero del mes es " + mes);
                    System.out.println(" el numero del año es " + año);

                } else {
                    System.out.println(" no cumple el dia");
                }

            } else if (mes == 5) {
                System.out.println("el numero del mes es " + mes);
                System.out.println(" el mes es mayo");
                System.out.println(" por favor introducir el dia");
                dia = entrada.nextInt();

                if ((dia >= 1) && (dia <= 31)) {
                    System.out.println(" el numero del dia es " + dia);
                    System.out.println(" el nombre del mes es : mayo");
                    System.out.println(" el numero del mes es " + mes);
                    System.out.println(" el numero del año es " + año);

                } else {
                    System.out.println(" no cumple el dia");
                }

            } else if (mes == 6) {
                System.out.println("el numero del mes es " + mes);
                System.out.println(" el mes es junio");
                System.out.println(" por favor introducir el dia");
                dia = entrada.nextInt();

                if ((dia >= 1) && (dia <= 31)) {
                    System.out.println(" el numero del dia es " + dia);
                    System.out.println(" el nombre del mes es : enero");
                    System.out.println(" el numero del mes es " + mes);
                    System.out.println(" el numero del año es " + año);

                } else {
                    System.out.println(" no cumple el dia");
                }

            } else if (mes == 7) {
                System.out.println("el numero del mes es " + mes);
                System.out.println(" el mes es julio");
                System.out.println(" por favor introducir el dia");
                dia = entrada.nextInt();

                if ((dia >= 1) && (dia <= 30)) {
                    System.out.println(" el numero del dia es " + dia);
                    System.out.println(" el nombre del mes es : julio");
                    System.out.println(" el numero del mes es " + mes);
                    System.out.println(" el numero del año es " + año);

                }

            } else if (mes == 8) {
                System.out.println("el numero del mes es " + mes);
                System.out.println(" el mes es agosto");
                System.out.println(" por favor introducir el dia");
                dia = entrada.nextInt();

                if ((dia >= 1) && (dia <= 31)) {
                    System.out.println(" el numero del dia es " + dia);
                    System.out.println(" el nombre del mes es : agosto");
                    System.out.println(" el numero del mes es " + mes);
                    System.out.println(" el numero del año es " + año);

                } else {
                    System.out.println(" no cumple el dia");
                    System.out.println(" el mes es :agosto");
                    System.out.println(" el numero del mes es "+mes);
                    System.out.println(" el año es "+año);
                }

            } else if (mes == 9) {
                System.out.println("el numero del mes es " + mes);
                System.out.println(" el mes es setiembre");
                System.out.println(" por favor introducir el dia");
                dia = entrada.nextInt();

                if ((dia >= 1) && (dia <= 30)) {
                    System.out.println(" el numero del dia es " + dia);
                    System.out.println(" el nombre del mes es : setiembre");
                    System.out.println(" el numero del mes es " + mes);
                    System.out.println(" el numero del año es " + año);

                } else {
                    System.out.println(" no cumple el dia");
                }

            } else if (mes == 10) {
                System.out.println("el numero del mes es " + mes);
                System.out.println(" el mes es octubre");
                System.out.println(" por favor introducir el dia");
                dia = entrada.nextInt();

                if ((dia >= 1) && (dia <= 31)) {
                    System.out.println(" el numero del dia es " + dia);
                    System.out.println(" el nombre del mes es : octubre");
                    System.out.println(" el numero del mes es " + mes);
                    System.out.println(" el numero del año es " + año);

                } else {
                    System.out.println(" no cumple el dia");
                }

            } else if (mes == 11) {
                System.out.println("el numero del mes es " + mes);
                System.out.println(" el mes es noviembre");
                System.out.println(" por favor introducir el dia");
                dia = entrada.nextInt();

                if ((dia >= 1) && (dia <= 30)) {
                    System.out.println(" el numero del dia es " + dia);
                    System.out.println(" el nombre del mes es : noviembre");
                    System.out.println(" el numero del mes es " + mes);
                    System.out.println(" el numero del año es " + año);

                } else {
                    System.out.println(" no cumple el dia");
                }

            } else if (mes == 12) {
                System.out.println("el numero del mes es " + mes);
                System.out.println(" el mes es diciembre");
                System.out.println(" por favor introducir el dia");
                dia = entrada.nextInt();

                if ((dia >= 1) && (dia <= 31)) {
                    System.out.println(" el numero del dia es " + dia);
                    System.out.println(" el nombre del mes es : diciembre");
                    System.out.println(" el numero del mes es " + mes);
                    System.out.println(" el numero del año es " + año);

                } else {
                    System.out.println(" no cumple el dia");
                }

            } else {
                System.out.println(" no cumple con lo requerido");

            }

        } else if (año > 0) {
            System.out.println("El año es bisiesto");
            System.out.println(" por favor introducir el mes ");
            mes = entrada.nextInt();

            if (mes == 1) {
                System.out.println("el numero del mes es " + mes);
                System.out.println(" el mes es enero");
                System.out.println(" por favor introducir el dia");
                dia = entrada.nextInt();

                if ((dia >= 1) && (dia <= 31)) {
                    System.out.println(" el numero del dia es " + dia);
                    System.out.println(" el nombre del mes es : enero");
                    System.out.println(" el numero del mes es " + mes);
                    System.out.println(" el numero del año es " + año);

                } else {
                    System.out.println(" no cumple el dia");
                }

            } else if (mes == 2) {
                System.out.println("el numero del mes es " + mes);
                System.out.println(" el mes es febrero");
                System.out.println(" por favor introducir el dia");
                dia = entrada.nextInt();

                if ((dia >= 1) && (dia <= 28)) {
                    System.out.println(" el numero del dia es " + dia);
                    System.out.println(" el nombre del mes es :febrero ");
                    System.out.println(" el numero del mes es " + mes);
                    System.out.println(" el numero del año es " + año);

                }

            } else if (mes == 3) {
                System.out.println("el numero del mes es " + mes);
                System.out.println(" el mes es marzo");
                System.out.println(" por favor introducir el dia");
                dia = entrada.nextInt();

                if ((dia >= 1) && (dia <= 31)) {
                    System.out.println(" el numero del dia es " + dia);
                    System.out.println(" el nombre del mes es : marzo");
                    System.out.println(" el numero del mes es " + mes);
                    System.out.println(" el numero del año es " + año);

                }

            } else if (mes == 4) {
                System.out.println("el numero del mes es " + mes);
                System.out.println(" el mes es abril");
                System.out.println(" por favor introducir el dia");
                dia = entrada.nextInt();

                if ((dia >= 1) && (dia <= 30)) {
                    System.out.println(" el numero del dia es " + dia);
                    System.out.println(" el nombre del mes es : abril");
                    System.out.println(" el numero del mes es " + mes);
                    System.out.println(" el numero del año es " + año);

                }

            } else if (mes == 5) {
                System.out.println("el numero del mes es " + mes);
                System.out.println(" el mes es mayo");
                System.out.println(" por favor introducir el dia");
                dia = entrada.nextInt();

                if ((dia >= 1) && (dia <= 31)) {
                    System.out.println(" el numero del dia es " + dia);
                    System.out.println(" el nombre del mes es : mayo");
                    System.out.println(" el numero del mes es " + mes);
                    System.out.println(" el numero del año es " + año);

                }

            } else if (mes == 6) {
                System.out.println("el numero del mes es " + mes);
                System.out.println(" el mes es junio");
                System.out.println(" por favor introducir el dia");
                dia = entrada.nextInt();

                if ((dia >= 1) && (dia <= 31)) {
                    System.out.println(" el numero del dia es " + dia);
                    System.out.println(" el nombre del mes es : enero");
                    System.out.println(" el numero del mes es " + mes);
                    System.out.println(" el numero del año es " + año);

                }

            } else if (mes == 7) {
                System.out.println("el numero del mes es " + mes);
                System.out.println(" el mes es julio");
                System.out.println(" por favor introducir el dia");
                dia = entrada.nextInt();

                if ((dia >= 1) && (dia <= 30)) {
                    System.out.println(" el numero del dia es " + dia);
                    System.out.println(" el nombre del mes es : julio");
                    System.out.println(" el numero del mes es " + mes);
                    System.out.println(" el numero del año es " + año);

                }

            } else if (mes == 8) {
                System.out.println("el numero del mes es " + mes);
                System.out.println(" el mes es agosto");
                System.out.println(" por favor introducir el dia");
                dia = entrada.nextInt();

                if ((dia >= 1) && (dia <= 31)) {
                    System.out.println(" el numero del dia es " + dia);
                    System.out.println(" el nombre del mes es : agosto");
                    System.out.println(" el numero del mes es " + mes);
                    System.out.println(" el numero del año es " + año);

                }

            } else if (mes == 9) {
                System.out.println("el numero del mes es " + mes);
                System.out.println(" el mes es setiembre");
                System.out.println(" por favor introducir el dia");
                dia = entrada.nextInt();

                if ((dia >= 1) && (dia <= 30)) {
                    System.out.println(" el numero del dia es " + dia);
                    System.out.println(" el nombre del mes es : setiembre");
                    System.out.println(" el numero del mes es " + mes);
                    System.out.println(" el numero del año es " + año);

                }

            } else if (mes == 10) {
                System.out.println("el numero del mes es " + mes);
                System.out.println(" el mes es octubre");
                System.out.println(" por favor introducir el dia");
                dia = entrada.nextInt();

                if ((dia >= 1) && (dia <= 31)) {
                    System.out.println(" el numero del dia es " + dia);
                    System.out.println(" el nombre del mes es : octubre");
                    System.out.println(" el numero del mes es " + mes);
                    System.out.println(" el numero del año es " + año);

                }

            } else if (mes == 11) {
                System.out.println("el numero del mes es " + mes);
                System.out.println(" el mes es noviembre");
                System.out.println(" por favor introducir el dia");
                dia = entrada.nextInt();

                if ((dia >= 1) && (dia <= 30)) {
                    System.out.println(" el numero del dia es " + dia);
                    System.out.println(" el nombre del mes es : noviembre");
                    System.out.println(" el numero del mes es " + mes);
                    System.out.println(" el numero del año es " + año);

                }

            } else if (mes == 12) {
                System.out.println("el numero del mes es " + mes);
                System.out.println(" el mes es diciembre");
                System.out.println(" por favor introducir el dia");
                dia = entrada.nextInt();

                if ((dia >= 1) && (dia <= 31)) {
                    System.out.println(" el numero del dia es " + dia);
                    System.out.println(" el nombre del mes es : diciembre");
                    System.out.println(" el numero del mes es " + mes);
                    System.out.println(" el numero del año es " + año);

                }

            } else {
                System.out.println(" no cumple con lo requerido");

            }

        } else {
            System.out.println(" el año no existe");

        }

    }

}
