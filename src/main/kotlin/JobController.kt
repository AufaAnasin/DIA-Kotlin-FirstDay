class JobController {
    private var jobList: MutableList<Job> = mutableListOf()

    // constructor {
    init {
        jobList = ArrayList()
    }
    fun addJob(job: Job) {
        if(jobList.none({it.getJobId() === job.getJobId()})) {
            jobList.add(job);
            println("Job Added")
        } else {
            println("Job ID ${job.getJobId()} already exist")
        }
    }

    fun deleteJobById(jobId: Int) {
        val iterator = jobList.iterator()
        while(iterator.hasNext()) {
            val job: Job = iterator.next()
            if (job.getJobId() == jobId) {
                iterator.remove();
                println("Job ${jobId} deleted.")
                return;
            }
        }
        println("Job ${jobId} not found.")
    }

    fun printAllJob() {
        if (jobList.isEmpty()) {
            println("No jobs in list")
        } else {
            for (job in jobList) {
                println(job)
            }
        }
    }
}