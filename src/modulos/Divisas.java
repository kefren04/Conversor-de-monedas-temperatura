package modulos;

/**
 * 1 Dólar (USD) = $19.6210
 * 1 Euro (EUR) = $20.7061
 * 1 Libra Esterlina (GBP) = $24.0171
 * 1 Yen Japonés (JPY) = $0.1436
 * 1 Won sul-coreano (KRW) = $0.0149
 */
public enum Divisas {
    // Lista de constantes para las divisas y su equivalente en Pesos 
    MXN(1), // En este caso, el Peso es mi referencia
    USD(19.6210),
    EUR(20.7061),
    GBP(24.0171),
    JPY(0.1436),
    KRW(0.0149);

    // Atributo creado para las divisas que corresponde a su valor equivalente en Pesos 
    private double equivalencia;
    
    // Asignación del atributo a la divisa
    Divisas(double equivalencia) {
        this.equivalencia = equivalencia;
    }

    // Getter de la equivalencia por si fuera necesario consultarlo desde otra clase
    public double getEquivalencia() {
        return equivalencia;
    }

    /**
     * Método para realizar la conversión de MXN a las demás divisas.
     * Recibe como parámetro un double de la cantidad de MXN a convertir 
     * y retorna su división entre la equivalencia de la divisa correspondiente.
     * Ej: Convertir 20 MXN a USD = Divisas.USD.convertirMXNADivisa(20)
     * @param cantidad
     * @return String con cantidad/equivalencia de la divisa en MXN.
     */
    public String convertirMXNADivisa(double cantidad) {
        return String.format("El resultado es %.4f %s.",(cantidad / this.equivalencia), this.toString());
    }

    /**
     * Método para realizar la conversión de las divisas a MXN.
     * Recibe como parámetro un double de la cantidad de la divisa a convertir 
     * y retorna su multiplicación por el equivalente de la divisa en MXN.
     * Ej: Convertir 20 USD a MXN = Divisas.USD.convertirAMXN(20)
     * @param cantidad
     * @return String con cantidad * equivalencia de la divisa en MXN.
     */
    public String convertirDivisaAMXN(double cantidad) {
        return String.format("El resultado es %.4f MXN.",(cantidad * this.equivalencia));
    }
}
