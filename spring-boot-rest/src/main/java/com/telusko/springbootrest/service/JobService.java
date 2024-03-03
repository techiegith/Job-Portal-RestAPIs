package com.telusko.springbootrest.service;
import com.telusko.springbootrest.model.JobPost;
import com.telusko.springbootrest.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepo repo;
    public void addJob(JobPost jobPost){

//        repo.addJob(jobPost);
        repo.save(jobPost);
    }
    //i need two method
    // one to view data and 2ns is view the data
    public List<JobPost> getAllJobs(){

//        return repo.getAllJobs();
        return repo.findAll();
    }

    public JobPost getJob(int postId) {

//        return repo.getJob(postId);
        return repo.findById(postId).orElse(new JobPost());
    }

    public void updateJob(JobPost jobPost) {

//        repo.updateJob(jobPost);
        repo.save(jobPost);
    }

    public void deleteJob(int postId) {
//        repo.deleteJob(postId);
        repo.deleteById(postId);
    }


    public void load() {
        List<JobPost> jobs = new ArrayList<>(List.of(
                new JobPost(1, "Java Developer", "Experience in Java development", 2, Arrays.asList("Java", "Spring", "Hibernate")),
                new JobPost(2, "Frontend Developer", "Experience in building web applications", 3, Arrays.asList("HTML", "CSS", "JavaScript", "React")),
                new JobPost(3, "Data Scientist", "Strong background in machine learning", 4, Arrays.asList("Python", "Machine Learning", "Data Analysis")),
                new JobPost(4, "Network Engineer", "Design and implement computer networks", 5, Arrays.asList("Networking", "Cisco", "Routing", "Switching")),
                new JobPost(5, "Mobile App Developer", "Experience in mobile app development", 3, Arrays.asList("iOS Development", "Android Development", "Mobile App"))

        ));
        repo.saveAll(jobs);
    }

    public List<JobPost> search(String keyword) {
        return repo.findByPostProfileContainingOrPostDescContaining(keyword, keyword);
    }
}


