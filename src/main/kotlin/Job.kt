class Job {
    private var jobId: Int = 0
        get() { return field }
        set(value) { field = value }
    private var address: String = ""
        get() { return field }
        set(value) { field = value }

    private var jobPosition: Position? = null
}