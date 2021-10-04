import android.util.Log

class LogUtils {
    companion object {
        fun debug(tag: String, message: String) {
            Log.d(tag, message)
        }

        fun error(tag: String, message: String) {
            Log.e(tag, message)
        }
    }
}