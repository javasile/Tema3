package enumeratedTypes.Task3;

public class Task3 {
    public static void main(String[] args) {

        float convertedTemp = TemperastureConvert.convertTemperature('C', 'K', 34f)  ;
        System.out.println(convertedTemp);

    }
}
interface Converter{
    float convert(float tempIn);
}

enum TemperastureConvert{
    C_F('C', 'F', new Converter() {
        @Override
        public float convert(float tempIn) {
            return (tempIn * 9 / 5) + 32;
        }
    }), C_K('C', 'K', new Converter() {
        @Override
        public float convert(float tempIn) {
            return tempIn + 273.15f;
        }
    }), K_C('K', 'C', new Converter() {
        @Override
        public float convert(float tempIn) {
            return tempIn + 273.15f;
        }
    }), F_C('F', 'C', new Converter() {
        @Override
        public float convert(float tempIn) {
            return (tempIn - 32) * 5 / 9;
        }
    }), F_K('F', 'K', new Converter() {
        @Override
        public float convert(float tempIn) {
            return (tempIn - 32f) * 5 / 9 + 273.15f;
        }
    }), K_F('K', 'F', new Converter() {
        @Override
        public float convert(float tempIn) {
            return (tempIn + 273.15f) * 9 / 5 + 32;
        }
    });

    private char input;
    private char output;
    private Converter convertor;

    TemperastureConvert(char input, char output, Converter converter) {
        this.input = input;
        this.output = output;
        this.convertor = converter;
    }
    public static float convertTemperature(char input, char output, float temp){
        for (TemperastureConvert temperastureConvert : values()){
            if (temperastureConvert.input == input && temperastureConvert.output == output){
                return temperastureConvert.convertor.convert(temp);
            }
        }
        return Integer.MIN_VALUE;
    }
}






