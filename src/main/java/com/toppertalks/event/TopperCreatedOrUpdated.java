package com.toppertalks.event;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.File;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor(force = true)
@Data
public class TopperCreatedOrUpdated implements Event {

    private Topper topper;

    @Data
    public static class Topper {
        private String id;
        private String name;
        private String emailID;
        private String phoneNumber;
        private String board;
        private String exam;
        private String otherExam;
        private String examYear;
        private String stream;
        private String positionObtained;
        private String multipleExam;
        private String highestQualification;
        private String currentOccupation;

        private File photo;
        private File evidence;
        private String evidenceUrl;
        private List<QuestionAnswers> questionAnswers;

    }

    @Data
    public static class QuestionAnswers {

        private String question;
        private String answer;

    }
}
