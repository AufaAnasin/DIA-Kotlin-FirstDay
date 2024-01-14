class Job {

    private var jobId: Int = 0
        set(value) { field = value }
    private var jobAddress: String = ""
        get() { return field }
        set(value) { field = value }

    var jobPosition: Position? = null
        get() { return field }
        set(value) { field = value }

    // constructor
    constructor(jobId: Int, jobAddress: String, jobPosition: Position) {
        this.jobId = jobId
        this.jobAddress = jobAddress
        this.jobPosition = jobPosition
    }
    fun getJobId(): Int {
        return jobId
    }
    override fun toString(): String {
        return "[" + "Job ID: " + jobId + ", Job Address: " + jobAddress +","+ jobPosition + "]"
    }
}