package io.pivotal.pal.repo;

import io.pivotal.pal.bean.TimeEntry;

import java.util.*;


public class InMemoryTimeEntryRepository implements TimeEntryRepository {

    Map<Long, TimeEntry> timeEntries = new HashMap<>();
    long i=0L;

    public TimeEntry create(TimeEntry timeEntry) {

        i++;
        timeEntry.setId(i);
        timeEntries.put(i, timeEntry );
        return timeEntry;
    }

    public TimeEntry find(long id) {


        return timeEntries.get(id);
    }

    public List<TimeEntry> list() {

        List<TimeEntry> timeEntryList = new ArrayList<>();

        for(Long id: timeEntries.keySet()) {
            timeEntryList.add(timeEntries.get(id));
        }

        return timeEntryList;
    }

    public TimeEntry update(long id, TimeEntry timeEntry) {

        if(timeEntries.get(id)==null){
            return null;
        }

        timeEntry.setId(id);
        timeEntries.put(id, timeEntry);
        return timeEntry;
    }

    public void delete(long id){

        timeEntries.remove(id);

    }
}
