class JobController {
    private var jobList: MutableList<Job> = mutableListOf()

    // constructor {
    init {
        jobList = ArrayList()
    }
    fun addJob(job: Job) {
        jobList.add(job);
        println("Job Added")
    }
    fun printAllJob() {
        if (jobList.isEmpty()) {
            println("No jobs in list")
        } else {
            println("Your current jobs: ")
            println(jobList);
        }
    }

    fun deleteJobById(jobId: Int) {
        val iterator: Iterator<Job> = jobList.iterator();
        while(iterator.hasNext()) {
            Job job =   
        }
    }
}