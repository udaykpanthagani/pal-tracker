package io.pivotal.pal.repo;

import io.pivotal.pal.bean.TimeEntry;

import java.util.List;

public interface TimeEntryRepository {
    
    
    TimeEntry create(TimeEntry timeEntry);

    TimeEntry find(long timeEntryId);

    List<TimeEntry> list();

    TimeEntry update(long eq, TimeEntry any);

    void delete(long timeEntryId);
}
