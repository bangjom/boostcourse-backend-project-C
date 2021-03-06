package kr.or.connect.reservation.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DisplayInfoImage {
    private Long id;
    private Long displayInfoId;
    private Long fileId;
    private String fileName;
    private String saveFileName;
    private String contentType;
    private Integer deleteFlag;
    @JsonFormat(shape = Shape.STRING, pattern = "yyyy-MM-dd kk:mm:ss", timezone = "Asia/Seoul")
    private LocalDateTime createDate;
    @JsonFormat(shape = Shape.STRING, pattern = "yyyy-MM-dd kk:mm:ss", timezone = "Asia/Seoul")
    private LocalDateTime modifyDate;
}
