
package Aplicacao;

public enum TiposDeFontesDeFosforo implements NutrientesAdicionais{
    SUPERFOSFATO_SIMPLES{
        @Override
        public String[] nutrientesAdicionais(){
            String nutrientes[] = {"Calcio", "Enxofre"};
            return nutrientes;
        }
        @Override
        public double[] valoresNutrientesAdicionais(){
            double valores[] = {0.28, 0.1};
            return valores;
        }  
    },
    SUPERFOSFATO_TRIPLO{
        @Override
        public String[] nutrientesAdicionais(){
            String nutrientes[] = {"Calcio", "Magnesio"};
            return nutrientes;
        }
        @Override
        public double[] valoresNutrientesAdicionais(){
            double valores[] = {0.2, 0.0};
            return valores;
        } 
    },
    MAP{
        @Override
        public String[] nutrientesAdicionais(){
            String nutrientes[] = {"Nitrogenio", ""};
            return nutrientes;
        }
        @Override
        public double[] valoresNutrientesAdicionais(){
            double valores[] = {0.09, 0.0};
            return valores;
        } 
    },
    DAP{
        @Override
        public String[] nutrientesAdicionais(){
            String nutrientes[] = {"Nitrogenio", ""};
            return nutrientes;
        }
        @Override
        public double[] valoresNutrientesAdicionais(){
            double valores[] = {0.16, 0.0};
            return valores;
        } 
    },
    YOORIN{
        @Override
        public String[] nutrientesAdicionais(){
            String nutrientes[] = {"Calcio", "Magnesio"};
            return nutrientes;
        }
        @Override
        public double[] valoresNutrientesAdicionais(){
            double valores[] = {0.28, 0.15};
            return valores;
        } 
    },
    FOSFATO_ARAD{
        @Override
        public String[] nutrientesAdicionais(){
            String nutrientes[] = {"Calcio", ""};
            return nutrientes;
        }
        @Override
        public double[] valoresNutrientesAdicionais(){
            double valores[] = {0.52, 0.0};
            return valores;
        } 
    },
    FOSFATO_GAFSA{
        @Override
        public String[] nutrientesAdicionais(){
            String nutrientes[] = {"Calcio", ""};
            return nutrientes;
        }
        @Override
        public double[] valoresNutrientesAdicionais(){
            double valores[] = {0.52, 0.0};
            return valores;
        } 
    },
    FOSFATO_DAOUI{
        @Override
        public String[] nutrientesAdicionais(){
            String nutrientes[] = {"Calcio", ""};
            return nutrientes;
        }
        @Override
        public double[] valoresNutrientesAdicionais(){
            double valores[] = {0.45, 0.0};
            return valores;
        } 
    },
    FOSFATO_PATOS_MINAS{
        @Override
        public String[] nutrientesAdicionais(){
            String nutrientes[] = {"Calcio", ""};
            return nutrientes;
        }
        @Override
        public double[] valoresNutrientesAdicionais(){
            double valores[] = {0.28, 0.0};
            return valores;
        } 
    },
    ESCORIA_DE_THOMAS{
        @Override
        public String[] nutrientesAdicionais(){
            String nutrientes[] = {"Calcio", ""};
            return nutrientes;
        }
        @Override
        public double[] valoresNutrientesAdicionais(){
            double valores[] = {0.44, 0.0};
            return valores;
        } 
    },
    ACIDO_FOSFORICO{
        @Override
        public String[] nutrientesAdicionais(){
            String nutrientes[] = {"", ""};
            return nutrientes;
        }
        @Override
        public double[] valoresNutrientesAdicionais(){
            double valores[] = {0.0, 0.0};
            return valores;
        } 
    },
    MULTIF_MAGNESIANO{
        @Override
        public String[] nutrientesAdicionais(){
            String nutrientes[] = {"Calcio", "Enxofre"};
            return nutrientes;
        }
        @Override
        public double[] valoresNutrientesAdicionais(){
            double valores[] = {0.18, 0.11};
            return valores;
        } 
    };

    public static boolean verificaFonte(String fonteUtilizar) {
        try {
            return TiposDeFontesDeFosforo.valueOf(fonteUtilizar) != null;
        } catch (Exception e) {
            return false;
        }
    }
    
   
    
}
