
import kotlin.math.sqrt

fun main(){}

fun sudoku(board:List<List<Char>>): Boolean {

    for (row in board) {
        val seen = mutableSetOf<Char>()
        for (cell in row) {
            if (cell == '-') {
                continue
            }
            if (seen.contains(cell)) {
                return false
            } else {
                seen.add(cell)
            }
        }
    }






    for (colum in 0 until board.size) {
        val seen = mutableSetOf<Char>()
        for (row in 0 until board.size) {
            val cell = board[row][colum]
            if (cell == '-') {
                continue
            }
            if (seen.contains(cell)) {
                return false
            } else {
                seen.add(cell)
            }

        }
    }

    val dublesize=(board.size).toDouble()
    val stepnumber = sqrt(dublesize).toInt()

    for(row in 0 until board.size step stepnumber){
            for(col in 0 until board.size step stepnumber){
                val seen = mutableSetOf<Char>()

                for(i in 0 until stepnumber){
                    for(j in 0 until stepnumber){

                        val cell = board[row + i][col + j]
                        if (cell == '-') {
                            continue
                        }
                        if (seen.contains(cell)) {
                            return false
                        } else {
                            seen.add(cell)
                        }



                    }

                }

            }

        }


    return true

    }









