public class FormatadorCep {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("81260280");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("O CEP não possui 8 dígitos!");
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException {
        if (cep.length() != 8)
            throw new CepInvalidoException("O CEP deve possuir exatamente 8 dígitos.");
        
        // Formatando o CEP
        String cepFormatado = cep.substring(0, 2) + "." + cep.substring(2, 5) + "-" + cep.substring(5);
        return cepFormatado;
    }
}

class CepInvalidoException extends Exception {
    public CepInvalidoException(String message) {
        super(message);
    }
}
