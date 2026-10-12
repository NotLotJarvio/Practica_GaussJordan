# Práctica: Método de Gauss-Jordan

## Estructura Modular del Proyecto
El proyecto está construido bajo el principio de reutilización de software y modularidad, dividido en tres clases:
1. **Gauss**: Contiene el método `eliminacionGaussiana` de la práctica anterior para reducir la matriz a su forma triangular superior.
2. **GaussJordan**: Invoca el método de triangulación de la clase `Gauss` y completa la reducción normalizando los pivotes a la unidad (1) y realizando el barrido superior para eliminar los coeficientes restantes, logrando la matriz identidad.
3. **Main**: Inicializa la matriz aumentada y ejecuta los métodos de resolución y presentación de resultados.

## Pasos para compilar y ejecutar el programa en Java
1. Abre una terminal y navega hasta la carpeta `src` del proyecto.
2. Compila los archivos escribiendo:
   ```bash
   javac Main.java Gauss.java GaussJordan.java