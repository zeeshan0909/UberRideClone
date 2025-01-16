package com.ansari.project.uber.uber.services;

import org.locationtech.jts.geom.Point;

public interface DistanceService {

    double calculatedDistance(Point src, Point dest);
}
