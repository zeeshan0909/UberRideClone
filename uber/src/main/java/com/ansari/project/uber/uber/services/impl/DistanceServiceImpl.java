package com.ansari.project.uber.uber.services.impl;

import com.ansari.project.uber.uber.services.DistanceService;
import org.locationtech.jts.geom.Point;
import org.springframework.stereotype.Service;


@Service
public class DistanceServiceImpl implements DistanceService {
    @Override
    public double calculatedDistance(Point src, Point dest) {
        return 0;
    }
}
