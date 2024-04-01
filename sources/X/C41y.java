package X;

import android.graphics.Matrix;
import android.graphics.Point;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.whatsapp.camera.litecamera.LiteCameraView;
import com.whatsapp.migration.android.view.GoogleMigrateImporterActivity;
import java.util.List;

/* renamed from: X.41y  reason: invalid class name */
/* loaded from: classes3.dex */
public class C41y implements Handler.Callback {
    public final Handler A00 = new Handler(Looper.getMainLooper(), this);

    public void A00(int i, Object obj) {
        Handler handler = this.A00;
        handler.sendMessage(handler.obtainMessage(i, obj));
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        C42C c42c;
        switch (message.what) {
            case 1:
                List list = (List) message.obj;
                for (int i = 0; i < list.size(); i++) {
                    ((AnonymousClass472) list.get(i)).A00();
                }
                break;
            case 2:
                List list2 = (List) message.obj;
                for (int i2 = 0; i2 < list2.size(); i2++) {
                    LiteCameraView liteCameraView = ((AnonymousClass472) list2.get(i2)).A00;
                    liteCameraView.A08.edit().putInt("camera_facing", liteCameraView.A0A.A00).apply();
                    ((AnonymousClass472) list2.get(i2)).A00();
                }
                break;
            case 3:
                List list3 = (List) ((Object[]) message.obj)[0];
                for (int i3 = 0; i3 < list3.size(); i3++) {
                    LiteCameraView liteCameraView2 = ((AnonymousClass472) list3.get(i3)).A00;
                    liteCameraView2.A0F = false;
                    if (!liteCameraView2.A05) {
                        liteCameraView2.A05 = true;
                        liteCameraView2.pause();
                        liteCameraView2.ARs();
                    } else {
                        InterfaceC49112In interfaceC49112In = liteCameraView2.A00;
                        if (interfaceC49112In != null) {
                            interfaceC49112In.AI9(1);
                        }
                    }
                }
                break;
            case 4:
                List list4 = (List) ((Object[]) message.obj)[0];
                for (int i4 = 0; i4 < list4.size(); i4++) {
                    LiteCameraView liteCameraView3 = ((AnonymousClass472) list4.get(i4)).A00;
                    liteCameraView3.A0F = false;
                    InterfaceC49112In interfaceC49112In2 = liteCameraView3.A00;
                    if (interfaceC49112In2 != null) {
                        interfaceC49112In2.AI9(2);
                    }
                }
                break;
            case 5:
                C471729x c471729x = ((AnonymousClass476) message.obj).A00;
                c471729x.A00.A0s.A02.post(new RunnableEBaseShape0S0100000_I0_0(c471729x, 49));
                return false;
            case 6:
                Object[] objArr = (Object[]) message.obj;
                AnonymousClass476 anonymousClass476 = (AnonymousClass476) objArr[0];
                byte[] bArr = (byte[]) objArr[1];
                C44A c44a = (C44A) objArr[2];
                if (c44a != null) {
                    C07K.A0F(c44a.A08);
                }
                anonymousClass476.A00.A00(bArr, anonymousClass476.A01.AFI());
                return false;
            case 7:
                InterfaceC49112In interfaceC49112In3 = ((AnonymousClass476) ((Object[]) message.obj)[0]).A01.A00;
                if (interfaceC49112In3 != null) {
                    interfaceC49112In3.AI9(3);
                    return false;
                }
                break;
            case 8:
                Object[] objArr2 = (Object[]) message.obj;
                C07K.A1K((C44N) objArr2[1]);
                InterfaceC49112In interfaceC49112In4 = ((AnonymousClass474) objArr2[0]).A00.A00;
                if (interfaceC49112In4 != null) {
                    interfaceC49112In4.AQI();
                    return false;
                }
                break;
            case 9:
                C07K.A1K((C44N) ((Object[]) message.obj)[1]);
                return false;
            case 10:
                InterfaceC49112In interfaceC49112In5 = ((AnonymousClass474) ((Object[]) message.obj)[0]).A00.A00;
                if (interfaceC49112In5 != null) {
                    interfaceC49112In5.AI9(4);
                    return false;
                }
                break;
            case GoogleMigrateImporterActivity.A0E /* 11 */:
                Object[] objArr3 = (Object[]) message.obj;
                Point point = (Point) objArr3[1];
                InterfaceC49112In interfaceC49112In6 = ((AnonymousClass475) objArr3[0]).A00.A00;
                if (interfaceC49112In6 != null) {
                    interfaceC49112In6.AHd(point.x, point.y);
                    return false;
                }
                break;
            case 12:
                LiteCameraView liteCameraView4 = ((AnonymousClass475) ((Object[]) message.obj)[0]).A00;
                liteCameraView4.A0A.A09 = null;
                InterfaceC49112In interfaceC49112In7 = liteCameraView4.A00;
                if (interfaceC49112In7 != null) {
                    interfaceC49112In7.AHe(true);
                    return false;
                }
                break;
            case 13:
                LiteCameraView liteCameraView5 = ((AnonymousClass475) message.obj).A00;
                liteCameraView5.A0A.A09 = null;
                InterfaceC49112In interfaceC49112In8 = liteCameraView5.A00;
                if (interfaceC49112In8 != null) {
                    interfaceC49112In8.AHe(false);
                    return false;
                }
                break;
            case 14:
                LiteCameraView liteCameraView6 = ((AnonymousClass475) message.obj).A00;
                liteCameraView6.A0A.A09 = null;
                InterfaceC49112In interfaceC49112In9 = liteCameraView6.A00;
                if (interfaceC49112In9 != null) {
                    interfaceC49112In9.AHe(false);
                    return false;
                }
                break;
            case 15:
                Object[] objArr4 = (Object[]) message.obj;
                C44W c44w = (C44W) objArr4[0];
                C885643p c885643p = (C885643p) objArr4[1];
                int intValue = ((Number) objArr4[2]).intValue();
                int intValue2 = ((Number) objArr4[3]).intValue();
                if (c44w == null) {
                    throw null;
                }
                if (intValue > 0 && intValue2 > 0 && (c42c = (C42C) c885643p.A00.A00(AbstractC886243v.A0e)) != null) {
                    Matrix matrix = new Matrix();
                    AnonymousClass423 anonymousClass423 = c44w.A0M;
                    if (anonymousClass423.AUK(intValue, intValue2, c42c.A01, c42c.A00, matrix, c44w.A0A)) {
                        anonymousClass423.AEx(intValue, intValue2, c885643p.A01, matrix);
                        if (c44w.A0K != null) {
                            if (!C44Y.A0E) {
                                c44w.A0G.setTransform(matrix);
                                return false;
                            }
                        } else {
                            throw null;
                        }
                    }
                }
                break;
        }
        return false;
    }
}
