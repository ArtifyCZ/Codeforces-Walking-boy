fun main() {
    (1..(readln().toInt())).forEach { _ ->
        val n = readln().toInt()
        val a = readln().split(' ').map { it.toInt() }

        var prev_point = 0
        var found = 0

        run {
            var i = 0

            while (prev_point < 1440) {
                val next = if (i < n) a[i] else 1440
                if (prev_point + 120 <= next) {
                    found++
                    prev_point += 120
                } else {
                    prev_point = next
                    i++
                }
            }
        }

        println(if(2 <= found) "YES" else "NO")
    }
}
