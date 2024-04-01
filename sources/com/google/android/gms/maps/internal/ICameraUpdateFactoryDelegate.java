package com.google.android.gms.maps.internal;

import android.os.IInterface;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* loaded from: classes.dex */
public interface ICameraUpdateFactoryDelegate extends IInterface {
    IObjectWrapper AGe(CameraPosition cameraPosition);

    IObjectWrapper AGg(LatLng latLng);

    IObjectWrapper AGh(LatLngBounds latLngBounds, int i);

    IObjectWrapper AGi(LatLng latLng, float f);

    IObjectWrapper AWZ(float f);
}
