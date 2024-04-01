package com.google.android.gms.maps.internal;

import X.C18U;
import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes.dex */
public interface IMapViewDelegate extends IInterface {
    void AB3(C18U c18u);

    IObjectWrapper ADt();

    void AJ4(Bundle bundle);

    void AMk();

    void AOH();

    void AOJ(Bundle bundle);

    void onDestroy();

    void onLowMemory();
}
