package org.example;

public class CalcService {

        private final Calculator dependency;
        public CalcService(Calculator addService) {
            this.dependency = addService;
        }
        public int calc(int x, int y) {
            return dependency.add(x, y);
        }
    }

