package ani.dantotsu.aniyomi.util.extension

enum class InstallStep {
    Idle, Pending, Downloading, Installing, Installed, Error;

    fun isCompleted(): Boolean {
        return this == Installed || this == Error || this == Idle
    }
}
