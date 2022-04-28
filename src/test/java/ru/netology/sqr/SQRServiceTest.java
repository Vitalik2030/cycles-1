package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {


        @Test
        void SQRService() {
                SQRService service = new SQRService();
                int actule = service.calculate(200, 300);
                int expected = 3;
                assertEquals(expected, actule);

        }

        @Test
        void SQRServiceBorders() {
                SQRService service = new SQRService();
                int actule = service.calculate(400, 300);
                int expected = 0;
                assertEquals(expected, actule);
        }
        @Test
        void SQRServiceBordersBelowСonditions() {
                SQRService service = new SQRService();
                int actule = service.calculate(1, 99);
                int expected = 0;
                assertEquals(expected, actule);
        }
        @Test
        void SQRServiceBordersAboveConditions() {
                SQRService service = new SQRService();
                int actule = service.calculate(9802,100000);
                int expected = 0;
                assertEquals(expected, actule);
        }
}
