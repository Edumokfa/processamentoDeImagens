package com.mycompany.processamentoimagens;

/**
 *
 * @author Pedro
 */
public enum Operation {

    SUM {
        @Override
        public Integer getResult(Integer value1, Integer value2, Integer coeficient) {
            return value1 + value2;
        }
    }, SUBTRACT {
        @Override
        public Integer getResult(Integer value1, Integer value2, Integer coeficient) {
            return value1 - value2;
        }
    }, DIVISION {
        @Override
        public Integer getResult(Integer value1, Integer value2, Integer coeficient) {
            if (value2 == 0) {
                return value1;
            }
            return value1 / value2;
        }
    }, MULTIPLICATION {
        @Override
        public Integer getResult(Integer value1, Integer value2, Integer coeficient) {
            return value1 * value2;
        }
    }, AND {
        @Override
        public Integer getResult(Integer value1, Integer value2, Integer coeficient) {
            boolean v1 = value1 > 0;
            boolean v2 = value2 > 0;
            return (v1 && v2) ? 255 : 0;
        }
    }, OR {
        @Override
        public Integer getResult(Integer value1, Integer value2, Integer coeficient) {
            boolean v1 = value1 > 0;
            boolean v2 = value2 > 0;
            return (v1 || v2) ? 255 : 0;
        }
    }, XOR {
        @Override
        public Integer getResult(Integer value1, Integer value2, Integer coeficient) {
            boolean v1 = value1 > 0;
            boolean v2 = value2 > 0;
            return (v1 ^ v2) ? 255 : 0;
        }
    }, NOT {
        @Override
        public Integer getResult(Integer value1, Integer value2, Integer coeficient) {
            if (value1 == 255) {
                return 0;
            }
            return 255;
        }
    }, BLENDING {
        @Override
        public Integer getResult(Integer value1, Integer value2, Integer coeficient) {
            double coeficientResult = coeficient / 100.0;
            double result = coeficientResult * value1 + (1 - coeficientResult) * value2;
            return (int) Math.round(result);
        }
    }, NEGATIVE {
        @Override
        public Integer getResult(Integer value1, Integer value2, Integer coeficient) {
            return 255 - value1;
        }
    };

    public abstract Integer getResult(Integer value1, Integer value2, Integer coeficient);
}
