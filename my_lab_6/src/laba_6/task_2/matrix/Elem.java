package laba_6.task_2.matrix;

public class Elem {
        private int row;
        private int col;
        private int meaning;

        public Elem(int row, int col, int meaning) {
            this.row = row;
            this.col = col;
            this.meaning = meaning;
        }

        public int getRow() {
            return row;
        }

        public int getCol() {
            return col;
        }

        public int getMeaning() {
            return meaning;
        }

        @Override
        public String toString() {
            return "Element{" +
                    "row=" + row +
                    ", col=" + col +
                    ", meaning=" + meaning +
                    '}';
        }
}

