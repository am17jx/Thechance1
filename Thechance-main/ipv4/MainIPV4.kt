fun ip(ip: String): Boolean {
    val segments = ip.split('.')
    if (segments.size != 4) return false

    for (segment in segments) {
        if (segment.isEmpty()  segment.length > 3  
            (segment.length > 1 && segment.startsWith("0"))) {
            return false
        }

        val num = segment.toIntOrNull() ?: return false
        if (num !in 0..255) return false
    }
    
    return true
}
