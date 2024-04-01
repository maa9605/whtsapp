package X;

import android.hardware.Camera;
import android.util.Log;
import java.util.List;

/* renamed from: X.455  reason: invalid class name */
/* loaded from: classes3.dex */
public class AnonymousClass455 extends AbstractC886543y {
    public AnonymousClass458 A00;
    public C886043t A01;

    public AnonymousClass455(Camera camera, Camera.Parameters parameters, AnonymousClass458 anonymousClass458, AnonymousClass459 anonymousClass459) {
        this.A00 = anonymousClass458;
        this.A01 = new C886043t(camera, parameters, anonymousClass458, anonymousClass459);
    }

    public void A00() {
        A02(super.A00.A00());
    }

    public void A01() {
        List list = (List) this.A00.A00(AbstractC885543o.A0W);
        int i = 4;
        if (!list.contains(4)) {
            i = 1;
            if (!list.contains(1)) {
                i = 6;
                if (!list.contains(6)) {
                    return;
                }
            }
        }
        super.A00.A01(AbstractC886243v.A0B, Integer.valueOf(i));
    }

    public void A02(C886443x c886443x) {
        boolean z;
        String str;
        super.A00 = new C886343w();
        C886043t c886043t = this.A01;
        AnonymousClass459 anonymousClass459 = null;
        if (c886043t != null) {
            try {
                anonymousClass459 = (AnonymousClass459) c886043t.A03.clone();
            } catch (CloneNotSupportedException e) {
                Log.e("ParametersModificationApplier", "Could not clone the camera settings", e);
            }
            boolean z2 = c886443x.A0p;
            if (z2) {
                z = c886043t.A01(AbstractC886243v.A0B, Integer.valueOf(c886443x.A0A));
            } else {
                z = false;
            }
            boolean z3 = c886443x.A0U;
            if (z3) {
                z |= c886043t.A01(AbstractC886243v.A00, Integer.valueOf(c886443x.A04));
            }
            boolean z4 = c886443x.A0h;
            if (z4) {
                z |= c886043t.A01(AbstractC886243v.A05, Integer.valueOf(c886443x.A06));
            }
            boolean z5 = c886443x.A0b;
            if (z5) {
                z |= c886043t.A01(AbstractC886243v.A0K, Boolean.valueOf(c886443x.A0a));
            }
            boolean z6 = c886443x.A0d;
            if (z6) {
                z |= c886043t.A01(AbstractC886243v.A0L, Boolean.valueOf(c886443x.A0c));
            }
            boolean z7 = c886443x.A0n;
            if (z7) {
                z |= c886043t.A01(AbstractC886243v.A09, Integer.valueOf(c886443x.A09));
            }
            boolean z8 = c886443x.A0j;
            if (z8) {
                z |= c886043t.A01(AbstractC886243v.A07, Integer.valueOf(c886443x.A08));
            }
            boolean z9 = c886443x.A0o;
            if (z9) {
                z |= c886043t.A01(AbstractC886243v.A0A, c886443x.A0S);
            }
            boolean z10 = c886443x.A10;
            if (z10) {
                z |= c886043t.A01(AbstractC886243v.A0S, Integer.valueOf(c886443x.A0C));
            }
            boolean z11 = c886443x.A11;
            if (z11) {
                z |= c886043t.A01(AbstractC886243v.A0T, Integer.valueOf(c886443x.A0D));
            }
            boolean z12 = c886443x.A12;
            if (z12) {
                z |= c886043t.A01(AbstractC886243v.A0U, c886443x.A0N);
            }
            boolean z13 = c886443x.A13;
            if (z13) {
                z |= c886043t.A01(AbstractC886243v.A0V, c886443x.A0T);
            }
            boolean z14 = c886443x.A17;
            if (z14) {
                z |= c886043t.A01(AbstractC886243v.A0Y, Integer.valueOf(c886443x.A0F));
            }
            boolean z15 = c886443x.A18;
            if (z15) {
                z |= c886043t.A01(AbstractC886243v.A0Z, c886443x.A0O);
            }
            boolean z16 = c886443x.A19;
            if (z16) {
                z |= c886043t.A01(AbstractC886243v.A0a, Integer.valueOf(c886443x.A0G));
            }
            boolean z17 = c886443x.A1B;
            if (z17) {
                z |= c886043t.A01(AbstractC886243v.A0c, Integer.valueOf(c886443x.A0H));
            }
            boolean z18 = c886443x.A1A;
            if (z18) {
                z |= c886043t.A01(AbstractC886243v.A0b, c886443x.A1N);
            }
            boolean z19 = c886443x.A1C;
            if (z19) {
                z |= c886043t.A01(AbstractC886243v.A0e, c886443x.A0P);
            }
            boolean z20 = c886443x.A1F;
            if (z20) {
                z |= c886043t.A01(AbstractC886243v.A0g, Integer.valueOf(c886443x.A0I));
            }
            boolean z21 = c886443x.A1I;
            if (z21) {
                z |= c886043t.A01(AbstractC886243v.A0R, Boolean.valueOf(c886443x.A1H));
            }
            boolean z22 = c886443x.A1G;
            if (z22) {
                z |= c886043t.A01(AbstractC886243v.A0i, c886443x.A0Q);
            }
            boolean z23 = c886443x.A1J;
            if (z23) {
                z |= c886043t.A01(AbstractC886243v.A0j, Integer.valueOf(c886443x.A0J));
            }
            boolean z24 = c886443x.A1K;
            if (z24) {
                z |= c886043t.A01(AbstractC886243v.A0k, Integer.valueOf(c886443x.A0K));
            }
            boolean z25 = c886443x.A0y;
            if (z25) {
                z |= c886043t.A01(AbstractC886243v.A0P, Boolean.valueOf(c886443x.A0x));
            }
            boolean z26 = c886443x.A1E;
            if (z26) {
                z |= c886043t.A01(AbstractC886243v.A0f, Boolean.valueOf(c886443x.A1D));
            }
            boolean z27 = c886443x.A0s;
            if (z27) {
                z |= c886043t.A01(AbstractC886243v.A0C, Double.valueOf(c886443x.A00));
            }
            boolean z28 = c886443x.A0t;
            if (z28) {
                z |= c886043t.A01(AbstractC886243v.A0D, Double.valueOf(c886443x.A01));
            }
            boolean z29 = c886443x.A0u;
            if (z29) {
                z |= c886043t.A01(AbstractC886243v.A0E, Double.valueOf(c886443x.A02));
            }
            boolean z30 = c886443x.A0v;
            if (z30) {
                z |= c886043t.A01(AbstractC886243v.A0F, c886443x.A0R);
            }
            boolean z31 = c886443x.A0w;
            if (z31) {
                z |= c886043t.A01(AbstractC886243v.A0G, Long.valueOf(c886443x.A0M));
            }
            boolean z32 = c886443x.A16;
            if (z32) {
                z |= c886043t.A01(AbstractC886243v.A0W, Integer.valueOf(c886443x.A0E));
            }
            boolean z33 = c886443x.A0z;
            if (z33) {
                z |= c886043t.A01(AbstractC886243v.A0H, Integer.valueOf(c886443x.A0B));
            }
            if (z) {
                try {
                    c886043t.A01.setParameters(c886043t.A00);
                    return;
                } catch (RuntimeException e2) {
                    Object[] objArr = new Object[4];
                    if (anonymousClass459 != null) {
                        str = anonymousClass459.A01();
                    } else {
                        str = "null";
                    }
                    objArr[0] = str;
                    objArr[1] = c886043t.A03.A01();
                    objArr[2] = c886043t.A00.flatten();
                    StringBuilder sb = new StringBuilder();
                    if (z2) {
                        sb.append("focusMode=");
                        sb.append(c886443x.A0A);
                    }
                    if (z3) {
                        sb.append(",antibanding=");
                        sb.append(c886443x.A04);
                    }
                    if (z4) {
                        sb.append(",colorEffect=");
                        sb.append(c886443x.A06);
                    }
                    if (z5) {
                        sb.append(",autoExposureLock=");
                        sb.append(c886443x.A0a);
                    }
                    if (z6) {
                        sb.append(",autoWhiteBalanceLock=");
                        sb.append(c886443x.A0c);
                    }
                    if (z7) {
                        sb.append(",flashMode=");
                        sb.append(c886443x.A09);
                    }
                    if (z8) {
                        sb.append(",exposureCompensation=");
                        sb.append(c886443x.A08);
                    }
                    if (z9) {
                        sb.append(",focusAreas=");
                        sb.append(C885943s.A01(c886443x.A0S));
                    }
                    if (z10) {
                        sb.append(",jpegQuality=");
                        sb.append(c886443x.A0C);
                    }
                    if (z11) {
                        sb.append(",jpegThumbnailQuality=");
                        sb.append(c886443x.A0D);
                    }
                    if (z12) {
                        sb.append(",jpegThumbnailSize=");
                        C42C c42c = c886443x.A0N;
                        sb.append(c42c.A01);
                        sb.append('x');
                        sb.append(c42c.A00);
                    }
                    if (z13) {
                        sb.append(",meteringAreas=");
                        sb.append(C885943s.A01(c886443x.A0T));
                    }
                    if (z14) {
                        sb.append(",pictureFormat=");
                        sb.append(c886443x.A0F);
                    }
                    if (z15) {
                        sb.append(",pictureSize=");
                        C42C c42c2 = c886443x.A0O;
                        sb.append(c42c2.A01);
                        sb.append('x');
                        sb.append(c42c2.A00);
                    }
                    if (z16) {
                        sb.append(",previewFormat=");
                        sb.append(c886443x.A0G);
                    }
                    if (z17) {
                        sb.append(",previewFrameRate=");
                        sb.append(c886443x.A0H);
                    }
                    if (z18) {
                        sb.append(",previewFrameRateRange=");
                        int[] iArr = c886443x.A1N;
                        sb.append(iArr[0]);
                        sb.append('-');
                        sb.append(iArr[1]);
                    }
                    if (z19) {
                        sb.append(",previewSize=");
                        C42C c42c3 = c886443x.A0P;
                        sb.append(c42c3.A01);
                        sb.append('x');
                        sb.append(c42c3.A00);
                    }
                    if (z20) {
                        sb.append(",sceneMode=");
                        sb.append(c886443x.A0I);
                    }
                    if (z21) {
                        sb.append(",videoStabilizationEnabled=");
                        sb.append(c886443x.A1H);
                    }
                    if (c886443x.A15) {
                        sb.append(",opticalStabilizationEnabled=");
                        sb.append(c886443x.A14);
                    }
                    if (z22) {
                        sb.append(",videoSize=");
                        C42C c42c4 = c886443x.A0Q;
                        sb.append(c42c4.A01);
                        sb.append('x');
                        sb.append(c42c4.A00);
                    }
                    if (z23) {
                        sb.append(",whiteBalance=");
                        sb.append(c886443x.A0J);
                    }
                    if (z24) {
                        sb.append(",zoom=");
                        sb.append(c886443x.A0K);
                    }
                    if (z25) {
                        sb.append(",hdrEnabled=");
                        sb.append(c886443x.A0x);
                    }
                    if (z26) {
                        sb.append(",recordingHint=");
                        sb.append(c886443x.A1D);
                    }
                    if (z27) {
                        sb.append(",gpsAltitude=");
                        sb.append(c886443x.A00);
                    }
                    if (z28) {
                        sb.append(",gpsLatitude=");
                        sb.append(c886443x.A01);
                    }
                    if (z29) {
                        sb.append(",gpsLongitude=");
                        sb.append(c886443x.A02);
                    }
                    if (z30) {
                        sb.append(",gpsProcessingMethod=");
                        sb.append(c886443x.A0R);
                    }
                    if (z31) {
                        sb.append(",gpsTimestamp=");
                        sb.append(c886443x.A0M);
                    }
                    if (z32) {
                        sb.append(",photoRotation=");
                        sb.append(c886443x.A0E);
                    }
                    if (z33) {
                        sb.append(",isoSensitivity=");
                        sb.append(c886443x.A0B);
                    }
                    if (c886443x.A0m) {
                        sb.append(",exposureTime=");
                        sb.append(c886443x.A0L);
                    }
                    if (c886443x.A0i) {
                        sb.append(",control3aMode=");
                        sb.append(c886443x.A07);
                    }
                    if (c886443x.A0V) {
                        sb.append(",aperture=");
                        sb.append(c886443x.A03);
                    }
                    if (c886443x.A0e) {
                        sb.append(",colorCorrectionGains=");
                        sb.append(c886443x.A1L);
                    }
                    if (c886443x.A0f) {
                        sb.append(",colorCorrectionMode=");
                        sb.append(c886443x.A05);
                    }
                    if (c886443x.A0g) {
                        sb.append(",colorCorrectionTransform=");
                        sb.append(c886443x.A1M);
                    }
                    if (c886443x.A0r) {
                        sb.append(",frameMetaDataEnabled=");
                        sb.append(c886443x.A0q);
                    }
                    if (c886443x.A0X) {
                        sb.append(",arCoreEnabled=");
                        sb.append(c886443x.A0W);
                    }
                    objArr[3] = sb.toString();
                    throw new RuntimeException(String.format("Failed to apply parameters. previous settings: (%s), new settings: (%s), parameters: (%s), modifications: (%s)", objArr), e2);
                }
            }
            return;
        }
        throw null;
    }
}
