package com.education.search.pojo;

import java.util.List;

public class SearchResult {
    private List<SearchCourse> courseList;
    private Long recordCount;
    private int pageConunt;
    private int curPage;

    public List<SearchCourse> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<SearchCourse> courseList) {
        this.courseList = courseList;
    }

    public Long getRecordCount() {
        return recordCount;
    }

    public void setRecordCount(Long recordCount) {
        this.recordCount = recordCount;
    }

    public int getPageConunt() {
        return pageConunt;
    }

    public void setPageConunt(int pageConunt) {
        this.pageConunt = pageConunt;
    }

    public int getCurPage() {
        return curPage;
    }

    public void setCurPage(int curPage) {
        this.curPage = curPage;
    }
}
