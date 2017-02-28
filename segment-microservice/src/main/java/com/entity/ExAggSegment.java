package com.entity;

import java.util.List;

/**
 * Created by muyun on 2017/3/1.
 */
public class ExAggSegment {


    private Segment segment;

    private List<SegmentPack> segmentPacks;

    public Segment getSegment() {
        return segment;
    }

    public void setSegment(Segment segment) {
        this.segment = segment;
    }

    public List<SegmentPack> getSegmentPacks() {
        return segmentPacks;
    }

    public void setSegmentPacks(List<SegmentPack> segmentPacks) {
        this.segmentPacks = segmentPacks;
    }
}
