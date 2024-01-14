import java.util.*

fun main(args: Array<String>) {
//     for add jobs into
//    val position1 = Position(1, "Software Developer")
//    val job1 = Job(1, "Mane Pak Kasih", position1)
//    jobController.addJob(job1)
//
//    val position2 = Position(2, "Software Developer")
//    val job2 = Job(2, "Mane Pak Kasih", position2)
//    jobController.addJob(job2)
//
//    val position3 = Position(2, "Software Developer")
//    val job3 = Job(2, "Mane Pak Kasih", position2)
//    jobController.addJob(job2)
//
//    jobController.printAllJob()
//
//    jobController.deleteJobById(2)
//
//    jobController.printAllJob()
//
//    jobController.deleteJobById(11)
    val jobController = JobController();
    while(true) {
        val scanner = Scanner(System.`in`)
        println("============DIGIJOBS============")
        println("Please choose the following command: ")
        println("1. Add new job")
        println("2. Print all jobs")
        println("3. Delete job")
        println("4. Exit")
        val userInput:Int = scanner.nextInt()
        if (userInput == 1) {
            println("Please input new job using following format : [job_id], [job_address], [job_position_id], [job_position_name]")1
            val scannerLine = Scanner(System.`in`)
            val jobInput: String = scannerLine.nextLine()
            val jobDetails: List<String> = jobInput?.split(",") ?: emptyList()
            val position = Position(jobDetails[2].toInt(), jobDetails[3].trim())
            val job = Job(jobDetails[0].toInt(), jobDetails[1].trim(), position)
            jobController.addJob(job)
        } else if (userInput == 2) {
            jobController.printAllJob()
        } else if (userInput == 3) {
            println("Put the Job ID that you want to deleted.")
            val deleteScanner = Scanner(System.`in`)
            val deleteInput:Int = deleteScanner.nextInt()
            jobController.deleteJobById(deleteInput);
        } else if (userInput == 4) {
            println("Thankyou for using this software, adios")
            break
        } else {
            break
        }
    }
}