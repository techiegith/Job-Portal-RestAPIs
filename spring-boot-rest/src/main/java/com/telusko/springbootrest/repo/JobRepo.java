package com.telusko.springbootrest.repo;

//import com.telusko.JobApp.model.JobPost;
import com.telusko.springbootrest.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;

@Repository

public interface JobRepo extends JpaRepository<JobPost, Integer> {

    List<JobPost> findByPostProfileContainingOrPostDescContaining(String postProfile, String postDesc);

}
// to have the data
//List<JobPost> jobs = new ArrayList<>(Arrays.asList(
//        new JobPost(1, "Java Developer", "Experience in Java development", 2, Arrays.asList("Java", "Spring", "Hibernate")),
//        new JobPost(2, "Frontend Developer", "Experience in building web applications", 3, Arrays.asList("HTML", "CSS", "JavaScript", "React")),
//        new JobPost(3, "Data Scientist", "Strong background in machine learning", 4, Arrays.asList("Python", "Machine Learning", "Data Analysis")),
//        new JobPost(4, "Network Engineer", "Design and implement computer networks", 5, Arrays.asList("Networking", "Cisco", "Routing", "Switching")),
//        new JobPost(5, "Mobile App Developer", "Experience in mobile app development", 3, Arrays.asList("iOS Development", "Android Development", "Mobile App"))
//
//));
//
//public List<JobPost> getAllJobs(){
//    return jobs;
//}
//
//public void addJob(JobPost job){
//    jobs.add(job);
//    System.out.println(jobs);
//}
//
//public JobPost getJob(int postId) {
//
//    for(JobPost job : jobs){
//        if(job.getPostId() == postId)
//            return job;
//    }
//    return null;
//
//}
//
//public void updateJob(JobPost jobPost) {
//    for(JobPost jobPost1 : jobs){
//        if(jobPost1.getPostId() == jobPost.getPostId()){
//            jobPost1.setPostProfile(jobPost.getPostProfile());
//            jobPost1.setPostDesc(jobPost.getPostDesc());
//            jobPost1.setReqExperience(jobPost.getReqExperience());
//            jobPost1.setPostTechStack(jobPost.getPostTechStack());
//        }
//    }
//}
//
//public void deleteJob(int postId) {
//    for(JobPost jobPost :jobs){
//        if(jobPost.getPostId() == postId)
//            jobs.remove(jobPost);
//    }
//}