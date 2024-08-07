package com.study.servletBoardProject.dto;

// 기능을 dto로 만든다고?
public class BoardDTO {
    private int boardId;                  // 게시글 id
    private int categoryId;               // 카테고리
    private String writer;                // 작성자
    private int password;                 // 비밀번호
    private String title;                 // 제목
    private String content;               // 내용
    private int viewCount;                // 조회수
    private String systemUplodeDatetime;  // 등록일시
    private String systemUpdateDatetime;  // 수정일시

    public int getBoardId() {
        return boardId;
    }

    public void setBoardId(int boardId) {
        this.boardId = boardId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getViewCount() {
        return viewCount;
    }

    public void setViewCount(int viewCount) {
        this.viewCount = viewCount;
    }

    public String getSystemUplodeDatetime() {
        return systemUplodeDatetime;
    }

    public void setSystemUplodeDatetime(String systemUplodeDatetime) {
        this.systemUplodeDatetime = systemUplodeDatetime;
    }

    public String getSystemUpdateDatetime() {
        return systemUpdateDatetime;
    }

    public void setSystemUpdateDatetime(String systemUpdateDatetime) {
        this.systemUpdateDatetime = systemUpdateDatetime;
    }

    @Override
    public String toString() {
        return "BoardDTO{" +
                "boardId=" + boardId +
                ", categoryId=" + categoryId +
                ", writer='" + writer + '\'' +
                ", password=" + password +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", viewCount=" + viewCount +
                ", systemUplodeDatetime='" + systemUplodeDatetime + '\'' +
                ", systemUpdateDatetime='" + systemUpdateDatetime + '\'' +
                '}';
    }
// Getters and Setters

}
