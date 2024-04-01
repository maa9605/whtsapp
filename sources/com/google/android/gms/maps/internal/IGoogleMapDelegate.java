package com.google.android.gms.maps.internal;

import X.C0SM;
import X.C18S;
import X.C18T;
import X.C18V;
import X.C18Y;
import X.C18b;
import X.C31861d4;
import X.C31871d5;
import X.InterfaceC237718a;
import X.InterfaceC237818c;
import android.os.IInterface;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.CameraPosition;

/* loaded from: classes.dex */
public interface IGoogleMapDelegate extends IInterface {
    C0SM A5F(C31871d5 c31871d5);

    void A5N(IObjectWrapper iObjectWrapper);

    void A5O(IObjectWrapper iObjectWrapper, C18Y c18y);

    void A5P(IObjectWrapper iObjectWrapper, int i, C18Y c18y);

    CameraPosition A8k();

    IProjectionDelegate ACc();

    IUiSettingsDelegate ADd();

    boolean AFt();

    void AGX(IObjectWrapper iObjectWrapper);

    void ARl();

    boolean ATA(boolean z);

    void ATB(InterfaceC237718a interfaceC237718a);

    boolean ATH(C31861d4 c31861d4);

    void ATI(int i);

    void ATL(float f);

    void ATQ(boolean z);

    void ATS(C18b c18b);

    void ATT(InterfaceC237818c interfaceC237818c);

    void ATU(C18S c18s);

    void ATW(C18T c18t);

    void ATX(C18V c18v);

    void ATZ(int i, int i2, int i3, int i4);

    void AU3(boolean z);

    void AV9();

    void clear();
}
