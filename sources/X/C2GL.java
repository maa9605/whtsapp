package X;

import android.app.Application;
import android.app.Service;
import android.os.Handler;
import android.os.Looper;
import com.whatsapp.AlarmService;
import com.whatsapp.ExternalMediaManager;
import com.whatsapp.appwidget.WidgetService;
import com.whatsapp.backup.google.GoogleBackupService;
import com.whatsapp.contact.sync.ContactsSyncAdapterService;
import com.whatsapp.data.ConversationDeleteService;
import com.whatsapp.instrumentation.api.InstrumentationService;
import com.whatsapp.instrumentation.service.InstrumentationFGService;
import com.whatsapp.location.LocationSharingService;
import com.whatsapp.media.transcode.MediaTranscodeService;
import com.whatsapp.messaging.MessageService;
import com.whatsapp.migration.android.integration.service.GoogleMigrateService;
import com.whatsapp.notification.AndroidWear;
import com.whatsapp.notification.DirectReplyService;
import com.whatsapp.perf.ProfiloUploadService;
import com.whatsapp.push.GcmListenerService;
import com.whatsapp.push.RegistrationIntentService;
import com.whatsapp.schedulers.alarm.SchedulerExperimentAlarmService;
import com.whatsapp.schedulers.job.SchedulerExperimentJobService;
import com.whatsapp.service.BackgroundMediaControlService;
import com.whatsapp.service.GcmFGService;
import com.whatsapp.service.MDSyncService;
import com.whatsapp.service.UnsentMessagesNetworkAvailableJob;
import com.whatsapp.service.WebClientService;
import com.whatsapp.util.WhatsAppLibLoader;
import com.whatsapp.util.crash.ExceptionsUploadService;
import com.whatsapp.voipcalling.SelfManagedConnectionService;
import com.whatsapp.voipcalling.VoiceFGService;

/* renamed from: X.2GL */
/* loaded from: classes2.dex */
public final class C2GL implements AnonymousClass005 {
    public Object A00;
    public final Service A01;

    public C2GL(Service service) {
        this.A01 = service;
    }

    @Override // X.AnonymousClass005
    public Object generatedComponent() {
        Object obj = this.A00;
        if (obj == null) {
            Service service = this.A01;
            Application application = service.getApplication();
            AnonymousClass029.A1J(application instanceof AnonymousClass005, "Hilt service must be attached to an @AndroidEntryPoint Application. Found: %s", application.getClass());
            C0E0 A0I = ((C0C5) C02180Ae.A0f(application, C0C5.class)).A0I();
            if (service != null) {
                A0I.A00 = service;
                final C02950Dn c02950Dn = A0I.A01;
                C0RY c0ry = new C0RY() { // from class: X.1XS
                    public volatile InterfaceC007103c A00;

                    public static C60002tl A00() {
                        if (C60002tl.A05 == null) {
                            synchronized (C60002tl.class) {
                                if (C60002tl.A05 == null) {
                                    AnonymousClass012 A00 = AnonymousClass012.A00();
                                    C012406b.A00();
                                    C60002tl.A05 = new C60002tl(A00, C0C9.A00(), C05Q.A00(), C05E.A00(), C07B.A00());
                                }
                            }
                        }
                        C60002tl c60002tl = C60002tl.A05;
                        C02180Ae.A1B(c60002tl);
                        return c60002tl;
                    }

                    @Override // X.C0RY
                    public void A01(AlarmService alarmService) {
                        alarmService.A0N = C41131tQ.A01();
                        alarmService.A0j = C41121tP.A00();
                        C01H A00 = C01H.A00();
                        C02180Ae.A1B(A00);
                        alarmService.A0i = A00;
                        AbstractC000600i A002 = AbstractC000600i.A00();
                        C02180Ae.A1B(A002);
                        alarmService.A01 = A002;
                        alarmService.A04 = C41131tQ.A00();
                        C001200o c001200o = C001200o.A01;
                        C02180Ae.A1B(c001200o);
                        alarmService.A0O = c001200o;
                        alarmService.A12 = C41131tQ.A04();
                        C012005w A003 = C012005w.A00();
                        C02180Ae.A1B(A003);
                        alarmService.A03 = A003;
                        alarmService.A18 = C41931uk.A06();
                        C01B A004 = C01B.A00();
                        C02180Ae.A1B(A004);
                        alarmService.A05 = A004;
                        C0EB A005 = C0EB.A00();
                        C02180Ae.A1B(A005);
                        alarmService.A0e = A005;
                        alarmService.A0C = C2MF.A01();
                        C42101v5 A006 = C42101v5.A00();
                        C02180Ae.A1B(A006);
                        alarmService.A0t = A006;
                        C0E6 A007 = C0E6.A00();
                        C02180Ae.A1B(A007);
                        alarmService.A06 = A007;
                        alarmService.A0Q = C41351tm.A00();
                        C05Y A01 = C05Y.A01();
                        C02180Ae.A1B(A01);
                        alarmService.A0o = A01;
                        C470029d A008 = C470029d.A00();
                        C02180Ae.A1B(A008);
                        alarmService.A08 = A008;
                        alarmService.A0G = C41141tR.A00();
                        alarmService.A0p = C41371to.A08();
                        C01R c01r = C01R.A02;
                        C02180Ae.A1B(c01r);
                        alarmService.A0S = c01r;
                        if (C71933Ya.A0C == null) {
                            synchronized (C71933Ya.class) {
                                if (C71933Ya.A0C == null) {
                                    C71933Ya.A0C = new C71933Ya(C003701t.A00(), c001200o, C02L.A00(), C002801j.A00(), C012005w.A00(), AnonymousClass011.A00(), AnonymousClass034.A00(), C000400f.A00(), C05E.A00(), C25Q.A00(), C05G.A00(), C42431vj.A00());
                                }
                            }
                        }
                        C71933Ya c71933Ya = C71933Ya.A0C;
                        C02180Ae.A1B(c71933Ya);
                        alarmService.A0y = c71933Ya;
                        alarmService.A0M = C42041uv.A01();
                        C0DV A009 = C0DV.A00();
                        C02180Ae.A1B(A009);
                        alarmService.A0r = A009;
                        C44311yr A0010 = C44311yr.A00();
                        C02180Ae.A1B(A0010);
                        alarmService.A0F = A0010;
                        C0C9 A0011 = C0C9.A00();
                        C02180Ae.A1B(A0011);
                        alarmService.A0U = A0011;
                        alarmService.A19 = C42001ur.A0A();
                        alarmService.A0D = C42061uy.A00();
                        C47402Bb A0012 = C47402Bb.A00();
                        C02180Ae.A1B(A0012);
                        alarmService.A0K = A0012;
                        C0CB A0013 = C0CB.A00();
                        C02180Ae.A1B(A0013);
                        alarmService.A0v = A0013;
                        C43121wt A0014 = C43121wt.A00();
                        C02180Ae.A1B(A0014);
                        alarmService.A0l = A0014;
                        C000400f A0015 = C000400f.A00();
                        C02180Ae.A1B(A0015);
                        alarmService.A0L = A0015;
                        C01J A0016 = C01J.A00();
                        C02180Ae.A1B(A0016);
                        alarmService.A0R = A0016;
                        C0L8 A0017 = C0L8.A00();
                        C02180Ae.A1B(A0017);
                        alarmService.A07 = A0017;
                        WhatsAppLibLoader A0018 = WhatsAppLibLoader.A00();
                        C02180Ae.A1B(A0018);
                        alarmService.A13 = A0018;
                        C44341yu A0019 = C44341yu.A00();
                        C02180Ae.A1B(A0019);
                        alarmService.A0B = A0019;
                        alarmService.A0Y = C42111v7.A02();
                        C451220m A0020 = C451220m.A00();
                        C02180Ae.A1B(A0020);
                        alarmService.A0h = A0020;
                        alarmService.A0d = C2MC.A02();
                        C43131wu A0021 = C43131wu.A00();
                        C02180Ae.A1B(A0021);
                        alarmService.A0k = A0021;
                        C05E A0022 = C05E.A00();
                        C02180Ae.A1B(A0022);
                        alarmService.A0Z = A0022;
                        C41291tg A0023 = C41291tg.A00();
                        C02180Ae.A1B(A0023);
                        alarmService.A0A = A0023;
                        alarmService.A0f = C41411ts.A00();
                        C03720Gu A0024 = C03720Gu.A00();
                        C02180Ae.A1B(A0024);
                        alarmService.A0c = A0024;
                        AnonymousClass075 A0025 = AnonymousClass075.A00();
                        C02180Ae.A1B(A0025);
                        alarmService.A0I = A0025;
                        alarmService.A0P = C41131tQ.A02();
                        InterfaceC007103c interfaceC007103c = this.A00;
                        if (interfaceC007103c == null) {
                            interfaceC007103c = new InterfaceC007103c() { // from class: X.1ik
                                {
                                    C1XS.this = this;
                                }

                                @Override // X.InterfaceC007103c
                                public Object get() {
                                    if (C1XS.this != null) {
                                        C003701t A0026 = C41121tP.A00();
                                        C001200o c001200o2 = C001200o.A01;
                                        C02180Ae.A1B(c001200o2);
                                        C02L A0027 = C41131tQ.A00();
                                        C012005w A0028 = C012005w.A00();
                                        C02180Ae.A1B(A0028);
                                        AnonymousClass011 A012 = C41121tP.A01();
                                        C01B A0029 = C01B.A00();
                                        C02180Ae.A1B(A0029);
                                        C0GU A0030 = C0GU.A00();
                                        C02180Ae.A1B(A0030);
                                        C03170Ep A0031 = C03170Ep.A00();
                                        C02180Ae.A1B(A0031);
                                        C05W A0032 = C41141tR.A00();
                                        C0GK A0033 = C0GK.A00();
                                        C02180Ae.A1B(A0033);
                                        C02180Ae.A1B(C01V.A00());
                                        C02E A013 = C42041uv.A01();
                                        C002301c A03 = C41131tQ.A03();
                                        AnonymousClass056 A0034 = AnonymousClass056.A00();
                                        C02180Ae.A1B(A0034);
                                        C0HA A0035 = C0HA.A00();
                                        C02180Ae.A1B(A0035);
                                        C000400f A0036 = C000400f.A00();
                                        C02180Ae.A1B(A0036);
                                        C2AS A06 = C2MF.A06();
                                        C0H4 A0037 = C0H4.A00();
                                        C02180Ae.A1B(A0037);
                                        C05E A0038 = C05E.A00();
                                        C02180Ae.A1B(A0038);
                                        C0E7 A0039 = C41341tl.A00();
                                        C02F A0040 = C02F.A00();
                                        C02180Ae.A1B(A0040);
                                        C000500h A02 = C41131tQ.A02();
                                        C0DW A0041 = C0DW.A00();
                                        C02180Ae.A1B(A0041);
                                        C05G A0042 = C05G.A00();
                                        C02180Ae.A1B(A0042);
                                        return new C60802v4(A0026, c001200o2, A0027, A0028, A012, A0029, A0030, A0031, A0032, A0033, A013, A03, A0034, A0035, A0036, A06, A0037, A0038, A0039, A0040, A02, A0041, A0042, C41371to.A02(), C42111v7.A00());
                                    }
                                    throw null;
                                }
                            };
                            this.A00 = interfaceC007103c;
                        }
                        alarmService.A1A = C41161tT.A00(interfaceC007103c);
                        C0G2 A0026 = C0G2.A00();
                        C02180Ae.A1B(A0026);
                        alarmService.A09 = A0026;
                        alarmService.A14 = C42141vB.A0A();
                        if (C26711Ki.A0D == null) {
                            synchronized (C26711Ki.class) {
                                if (C26711Ki.A0D == null) {
                                    C26711Ki.A0D = new C26711Ki(c001200o, AnonymousClass012.A00(), AbstractC000600i.A00(), C012005w.A00(), AnonymousClass011.A00(), AnonymousClass034.A00(), C01B.A00(), C000400f.A00(), C02F.A00(), C000500h.A00(), C05G.A00(), C03020Dv.A00());
                                }
                            }
                        }
                        C26711Ki c26711Ki = C26711Ki.A0D;
                        C02180Ae.A1B(c26711Ki);
                        alarmService.A02 = c26711Ki;
                        C03730Gv A0027 = C03730Gv.A00();
                        C02180Ae.A1B(A0027);
                        alarmService.A0W = A0027;
                        C02950Dn c02950Dn2 = c02950Dn;
                        InterfaceC007103c interfaceC007103c2 = c02950Dn2.A18;
                        if (interfaceC007103c2 == null) {
                            interfaceC007103c2 = new C03040Dx(c02950Dn2, 13);
                            c02950Dn2.A18 = interfaceC007103c2;
                        }
                        alarmService.A1C = C41161tT.A00(interfaceC007103c2);
                        C41661uJ A0028 = C41661uJ.A00();
                        C02180Ae.A1B(A0028);
                        alarmService.A0b = A0028;
                        alarmService.A0x = C2MF.A03();
                        C2QS A0029 = C2QS.A00();
                        C02180Ae.A1B(A0029);
                        alarmService.A16 = A0029;
                        if (C63002yu.A0A == null) {
                            synchronized (C63002yu.class) {
                                if (C63002yu.A0A == null) {
                                    C63002yu.A0A = new C63002yu(AbstractC000600i.A00(), C002801j.A00(), C012005w.A00(), AnonymousClass011.A00(), C01B.A00(), C0C9.A00(), C40411sD.A00(), C05E.A00(), C0F2.A00());
                                }
                            }
                        }
                        C63002yu c63002yu = C63002yu.A0A;
                        C02180Ae.A1B(c63002yu);
                        alarmService.A0n = c63002yu;
                        C0DW A0030 = C0DW.A00();
                        C02180Ae.A1B(A0030);
                        alarmService.A0q = A0030;
                        C0EW A0031 = C0EW.A00();
                        C02180Ae.A1B(A0031);
                        alarmService.A15 = A0031;
                        if (C25M.A06 == null) {
                            synchronized (AnonymousClass012.class) {
                                if (C25M.A06 == null) {
                                    AnonymousClass012 A0032 = AnonymousClass012.A00();
                                    InterfaceC002901k A0033 = C002801j.A00();
                                    C012005w A0034 = C012005w.A00();
                                    C01B.A00();
                                    C25M.A06 = new C25M(A0032, A0033, A0034, C44301yq.A00(), C0C9.A00(), C40411sD.A00(), C42471vn.A01(), C05E.A00(), C25Q.A00(), C06J.A01());
                                }
                            }
                        }
                        C25M c25m = C25M.A06;
                        C02180Ae.A1B(c25m);
                        alarmService.A0z = c25m;
                        C42961wc A0035 = C42961wc.A00();
                        C02180Ae.A1B(A0035);
                        alarmService.A0E = A0035;
                        C28K A0036 = C28K.A00();
                        C02180Ae.A1B(A0036);
                        alarmService.A0g = A0036;
                        alarmService.A0V = C42141vB.A02();
                        C0C8 A0037 = C0C8.A00();
                        C02180Ae.A1B(A0037);
                        alarmService.A0X = A0037;
                        C05G A0038 = C05G.A00();
                        C02180Ae.A1B(A0038);
                        alarmService.A0u = A0038;
                        C03020Dv A0039 = C03020Dv.A00();
                        C02180Ae.A1B(A0039);
                        alarmService.A00 = A0039;
                        alarmService.A0H = C41141tR.A01();
                        AbstractC41801uX A0040 = AbstractC41801uX.A00();
                        C02180Ae.A1B(A0040);
                        alarmService.A0w = A0040;
                        C47762Cm A0041 = C47762Cm.A00();
                        C02180Ae.A1B(A0041);
                        alarmService.A10 = A0041;
                        C03J A02 = C03J.A02();
                        C02180Ae.A1B(A02);
                        alarmService.A17 = A02;
                        C2D9 A0042 = C2D9.A00();
                        C02180Ae.A1B(A0042);
                        alarmService.A0T = A0042;
                        C0KQ A0043 = C0KQ.A00();
                        C02180Ae.A1B(A0043);
                        alarmService.A0J = A0043;
                        InterfaceC007103c interfaceC007103c3 = c02950Dn2.A0x;
                        if (interfaceC007103c3 == null) {
                            interfaceC007103c3 = new C03040Dx(c02950Dn2, 41);
                            c02950Dn2.A0x = interfaceC007103c3;
                        }
                        alarmService.A1D = C41161tT.A00(interfaceC007103c3);
                        C0EY A0044 = C0EY.A00();
                        C02180Ae.A1B(A0044);
                        alarmService.A11 = A0044;
                        InterfaceC007103c interfaceC007103c4 = c02950Dn2.A0n;
                        if (interfaceC007103c4 == null) {
                            interfaceC007103c4 = new C03040Dx(c02950Dn2, 42);
                            c02950Dn2.A0n = interfaceC007103c4;
                        }
                        alarmService.A1B = C41161tT.A00(interfaceC007103c4);
                        alarmService.A0a = A00();
                        alarmService.A0s = C42001ur.A08();
                        C04490Kj A0045 = C04490Kj.A00();
                        C02180Ae.A1B(A0045);
                        alarmService.A0m = A0045;
                    }

                    @Override // X.C0RY
                    public void A02(ExternalMediaManager externalMediaManager) {
                        C41131tQ.A04();
                        C000400f A00 = C000400f.A00();
                        C02180Ae.A1B(A00);
                        externalMediaManager.A01 = A00;
                        C47242Al A002 = C47242Al.A00();
                        C02180Ae.A1B(A002);
                        externalMediaManager.A02 = A002;
                        externalMediaManager.A00 = C42111v7.A00();
                    }

                    @Override // X.C0RY
                    public void A03(WidgetService widgetService) {
                        widgetService.A03 = C41131tQ.A01();
                        C03170Ep A00 = C03170Ep.A00();
                        C02180Ae.A1B(A00);
                        widgetService.A00 = A00;
                        widgetService.A01 = C41141tR.A00();
                        C018708s A002 = C018708s.A00();
                        C02180Ae.A1B(A002);
                        widgetService.A02 = A002;
                        widgetService.A04 = C41131tQ.A03();
                        C0DU A01 = C0DU.A01();
                        C02180Ae.A1B(A01);
                        widgetService.A05 = A01;
                    }

                    @Override // X.C0RY
                    public void A04(GoogleBackupService googleBackupService) {
                        C018508q A00 = C018508q.A00();
                        C02180Ae.A1B(A00);
                        googleBackupService.A05 = A00;
                        AbstractC000600i A002 = AbstractC000600i.A00();
                        C02180Ae.A1B(A002);
                        googleBackupService.A03 = A002;
                        C004902f A003 = C004902f.A00();
                        C02180Ae.A1B(A003);
                        googleBackupService.A0W = A003;
                        googleBackupService.A0X = C41131tQ.A04();
                        googleBackupService.A06 = C41131tQ.A00();
                        C001200o c001200o = C001200o.A01;
                        C02180Ae.A1B(c001200o);
                        googleBackupService.A0J = c001200o;
                        C012005w A004 = C012005w.A00();
                        C02180Ae.A1B(A004);
                        googleBackupService.A04 = A004;
                        C0EL A005 = C0EL.A00();
                        C02180Ae.A1B(A005);
                        googleBackupService.A08 = A005;
                        googleBackupService.A0P = C41121tP.A01();
                        AnonymousClass034 A006 = AnonymousClass034.A00();
                        C02180Ae.A1B(A006);
                        googleBackupService.A0H = A006;
                        C01B A007 = C01B.A00();
                        C02180Ae.A1B(A007);
                        googleBackupService.A07 = A007;
                        googleBackupService.A0T = C41371to.A0A();
                        C05Y A01 = C05Y.A01();
                        C02180Ae.A1B(A01);
                        googleBackupService.A0S = A01;
                        C470029d A008 = C470029d.A00();
                        C02180Ae.A1B(A008);
                        googleBackupService.A0F = A008;
                        googleBackupService.A0I = C42041uv.A01();
                        C03310Fe A009 = C03310Fe.A00();
                        C02180Ae.A1B(A009);
                        googleBackupService.A0A = A009;
                        googleBackupService.A0V = C41311ti.A04();
                        C010005b c010005b = C010005b.A07;
                        C02180Ae.A1B(c010005b);
                        googleBackupService.A09 = c010005b;
                        C42701wB A012 = C42701wB.A01();
                        C02180Ae.A1B(A012);
                        googleBackupService.A0U = A012;
                        C0CC A013 = C0CC.A01();
                        C02180Ae.A1B(A013);
                        googleBackupService.A0M = A013;
                        C05E A0010 = C05E.A00();
                        C02180Ae.A1B(A0010);
                        googleBackupService.A0O = A0010;
                        googleBackupService.A0D = C41871ue.A01();
                        C02F A0011 = C02F.A00();
                        C02180Ae.A1B(A0011);
                        googleBackupService.A0K = A0011;
                        googleBackupService.A0L = C41131tQ.A02();
                        googleBackupService.A0B = C42111v7.A00();
                        C05N A0012 = C05N.A00();
                        C02180Ae.A1B(A0012);
                        googleBackupService.A0N = A0012;
                        googleBackupService.A0C = C42111v7.A01();
                        C000800k c000800k = C000800k.A02;
                        C02180Ae.A1B(c000800k);
                        googleBackupService.A0G = c000800k;
                    }

                    @Override // X.C0RY
                    public void A05(ContactsSyncAdapterService contactsSyncAdapterService) {
                        AbstractC000600i A00 = AbstractC000600i.A00();
                        C02180Ae.A1B(A00);
                        contactsSyncAdapterService.A00 = A00;
                        contactsSyncAdapterService.A01 = C41211tY.A02();
                    }

                    @Override // X.C0RY
                    public void A06(ConversationDeleteService conversationDeleteService) {
                        C05A A00 = C05A.A00();
                        C02180Ae.A1B(A00);
                        conversationDeleteService.A01 = A00;
                        conversationDeleteService.A08 = C41131tQ.A04();
                        C05M A002 = C05M.A00();
                        C02180Ae.A1B(A002);
                        conversationDeleteService.A02 = A002;
                        C02180Ae.A1B(C01B.A00());
                        C0C9 A003 = C0C9.A00();
                        C02180Ae.A1B(A003);
                        conversationDeleteService.A04 = A003;
                        C03710Gt A004 = C03710Gt.A00();
                        C02180Ae.A1B(A004);
                        conversationDeleteService.A05 = A004;
                        conversationDeleteService.A07 = C2MF.A02();
                        C03340Fh c03340Fh = C03340Fh.A00;
                        C02180Ae.A1B(c03340Fh);
                        conversationDeleteService.A03 = c03340Fh;
                        C0C8 A005 = C0C8.A00();
                        C02180Ae.A1B(A005);
                        conversationDeleteService.A06 = A005;
                    }

                    @Override // X.C0RY
                    public void A07(InstrumentationService instrumentationService) {
                        Object obj2;
                        if (C62072xI.A04 == null) {
                            synchronized (C62072xI.class) {
                                if (C62072xI.A04 == null) {
                                    C62072xI.A04 = new C62072xI(C02L.A00(), C00C.A00(), C05G.A00(), C40371s6.A00());
                                }
                            }
                        }
                        C62072xI c62072xI = C62072xI.A04;
                        C02180Ae.A1B(c62072xI);
                        instrumentationService.A01 = c62072xI;
                        C02950Dn c02950Dn2 = c02950Dn;
                        Object obj3 = c02950Dn2.A0J;
                        if (obj3 instanceof C41111tO) {
                            synchronized (obj3) {
                                obj2 = c02950Dn2.A0J;
                                if (obj2 instanceof C41111tO) {
                                    C02L A00 = C41131tQ.A00();
                                    C005002g A002 = C005002g.A00();
                                    C02180Ae.A1B(A002);
                                    C07000Wb A003 = C07000Wb.A00();
                                    C02180Ae.A1B(A003);
                                    C001200o c001200o = C001200o.A01;
                                    C02180Ae.A1B(c001200o);
                                    C02F A004 = C02F.A00();
                                    C02180Ae.A1B(A004);
                                    C03020Dv A005 = C03020Dv.A00();
                                    C02180Ae.A1B(A005);
                                    C0F0 A006 = C0F0.A00();
                                    C02180Ae.A1B(A006);
                                    C3D7 c3d7 = new C3D7(c001200o, A004, A005, A006);
                                    C41241tb A02 = C02950Dn.A02();
                                    C0F1 A2M = c02950Dn2.A2M();
                                    Handler handler = new Handler(Looper.getMainLooper());
                                    C02180Ae.A1B(c001200o);
                                    C2IY A0D = C41171tU.A0D();
                                    C02F A007 = C02F.A00();
                                    C02180Ae.A1B(A007);
                                    C03020Dv A008 = C03020Dv.A00();
                                    C02180Ae.A1B(A008);
                                    C03030Dw A009 = C41231ta.A00();
                                    C0C7 A0010 = C0C7.A00();
                                    C02180Ae.A1B(A0010);
                                    C3DA c3da = new C3DA(handler, c001200o, A0D, A007, A008, A009, A0010);
                                    C00F A0011 = C00F.A00();
                                    C02180Ae.A1B(A0011);
                                    C3D8 c3d8 = new C3D8(A0011);
                                    C00C A0012 = C00C.A00();
                                    C02180Ae.A1B(A0012);
                                    C0F0 A0013 = C0F0.A00();
                                    C02180Ae.A1B(A0013);
                                    C3DB c3db = new C3DB(new C49032Ic("hangup_call", null, null), A0013, C41931uk.A04());
                                    C0F0 A0014 = C0F0.A00();
                                    C02180Ae.A1B(A0014);
                                    C3DB c3db2 = new C3DB(new C49032Ic("reject_call", null, null), A0014, C41931uk.A04());
                                    C41181tV A0A = C41171tU.A0A();
                                    C02990Ds A0015 = C02990Ds.A00();
                                    C02180Ae.A1B(A0015);
                                    C3D9 c3d9 = new C3D9(A0A, A0015);
                                    if (C62042xF.A01 == null) {
                                        synchronized (C62042xF.class) {
                                            if (C62042xF.A01 == null) {
                                                C62042xF.A01 = new C62042xF(C00E.A00());
                                            }
                                        }
                                    }
                                    C62042xF c62042xF = C62042xF.A01;
                                    C02180Ae.A1B(c62042xF);
                                    C41191tW A01 = C02950Dn.A01();
                                    C05G A0016 = C05G.A00();
                                    C02180Ae.A1B(A0016);
                                    C40371s6 A0017 = C40371s6.A00();
                                    C02180Ae.A1B(A0017);
                                    obj2 = new C62052xG(A00, A002, A003, c3d7, A02, A2M, c3da, c3d8, A0012, c3db, c3db2, c3d9, c62042xF, A01, A0016, A0017);
                                    C41161tT.A01(c02950Dn2.A0J, obj2);
                                    c02950Dn2.A0J = obj2;
                                }
                            }
                            obj3 = obj2;
                        }
                        instrumentationService.A00 = (C62052xG) obj3;
                        C00G A0018 = C00G.A00();
                        C02180Ae.A1B(A0018);
                        instrumentationService.A02 = A0018;
                    }

                    @Override // X.C0RY
                    public void A08(InstrumentationFGService instrumentationFGService) {
                        C0ER A00 = C0ER.A00();
                        C02180Ae.A1B(A00);
                        ((C0IL) instrumentationFGService).A01 = A00;
                    }

                    @Override // X.C0RY
                    public void A09(LocationSharingService locationSharingService) {
                        locationSharingService.A05 = C41131tQ.A01();
                        locationSharingService.A04 = C42041uv.A01();
                        C451520p A00 = C451520p.A00();
                        C02180Ae.A1B(A00);
                        locationSharingService.A0B = A00;
                        locationSharingService.A07 = C41131tQ.A02();
                        C02F A002 = C02F.A00();
                        C02180Ae.A1B(A002);
                        locationSharingService.A06 = A002;
                        C0G2 A003 = C0G2.A00();
                        C02180Ae.A1B(A003);
                        locationSharingService.A02 = A003;
                        C0IK A01 = C0IK.A01();
                        C02180Ae.A1B(A01);
                        locationSharingService.A01 = A01;
                        locationSharingService.A08 = C41311ti.A01();
                        C0G4 A004 = C0G4.A00();
                        C02180Ae.A1B(A004);
                        locationSharingService.A03 = A004;
                        locationSharingService.A09 = C42111v7.A07();
                    }

                    @Override // X.C0RY
                    public void A0A(MediaTranscodeService mediaTranscodeService) {
                        mediaTranscodeService.A01 = C41141tR.A00();
                        C018708s A00 = C018708s.A00();
                        C02180Ae.A1B(A00);
                        mediaTranscodeService.A02 = A00;
                        C00A c00a = C00A.A00;
                        C02180Ae.A1B(c00a);
                        mediaTranscodeService.A04 = c00a;
                        mediaTranscodeService.A05 = C41871ue.A04();
                    }

                    @Override // X.C0RY
                    public void A0B(MessageService messageService) {
                        C018508q A00 = C018508q.A00();
                        C02180Ae.A1B(A00);
                        messageService.A00 = A00;
                        C005002g A002 = C005002g.A00();
                        C02180Ae.A1B(A002);
                        messageService.A01 = A002;
                    }

                    @Override // X.C0RY
                    public void A0C(GoogleMigrateService googleMigrateService) {
                        Object obj2;
                        C0ER A00 = C0ER.A00();
                        C02180Ae.A1B(A00);
                        ((C0IL) googleMigrateService).A01 = A00;
                        C001200o c001200o = C001200o.A01;
                        C02180Ae.A1B(c001200o);
                        googleMigrateService.A03 = C41131tQ.A04();
                        C02950Dn c02950Dn2 = c02950Dn;
                        googleMigrateService.A01 = c02950Dn2.A2T();
                        googleMigrateService.A00 = c02950Dn2.A2S();
                        Object obj3 = c02950Dn2.A0E;
                        if (obj3 instanceof C41111tO) {
                            synchronized (obj3) {
                                obj2 = c02950Dn2.A0E;
                                if (obj2 instanceof C41111tO) {
                                    C02180Ae.A1B(c001200o);
                                    C002301c A03 = C41131tQ.A03();
                                    C005102h A002 = C005102h.A00();
                                    C02180Ae.A1B(A002);
                                    obj2 = new C3MN(c001200o, A03, A002);
                                    C41161tT.A01(c02950Dn2.A0E, obj2);
                                    c02950Dn2.A0E = obj2;
                                }
                            }
                            obj3 = obj2;
                        }
                        googleMigrateService.A02 = (C3MN) obj3;
                    }

                    @Override // X.C0RY
                    public void A0D(AndroidWear androidWear) {
                        C018508q A00 = C018508q.A00();
                        C02180Ae.A1B(A00);
                        androidWear.A00 = A00;
                        C03070Ea A002 = C03070Ea.A00();
                        C02180Ae.A1B(A002);
                        androidWear.A07 = A002;
                        C018608r A02 = C018608r.A02();
                        C02180Ae.A1B(A02);
                        androidWear.A01 = A02;
                        androidWear.A02 = C41141tR.A00();
                        androidWear.A04 = C42041uv.A01();
                        androidWear.A05 = C41371to.A09();
                        androidWear.A03 = C41211tY.A03();
                        C02O A003 = C02O.A00();
                        C02180Ae.A1B(A003);
                        androidWear.A06 = A003;
                    }

                    @Override // X.C0RY
                    public void A0E(DirectReplyService directReplyService) {
                        C018508q A00 = C018508q.A00();
                        C02180Ae.A1B(A00);
                        directReplyService.A00 = A00;
                        C03070Ea A002 = C03070Ea.A00();
                        C02180Ae.A1B(A002);
                        directReplyService.A09 = A002;
                        C018608r A02 = C018608r.A02();
                        C02180Ae.A1B(A02);
                        directReplyService.A01 = A02;
                        directReplyService.A02 = C41141tR.A00();
                        directReplyService.A04 = C42041uv.A01();
                        C00A c00a = C00A.A00;
                        C02180Ae.A1B(c00a);
                        directReplyService.A05 = c00a;
                        directReplyService.A06 = C41371to.A09();
                        C03080Ec A003 = C03080Ec.A00();
                        C02180Ae.A1B(A003);
                        directReplyService.A07 = A003;
                        directReplyService.A03 = C41211tY.A03();
                        C02O A004 = C02O.A00();
                        C02180Ae.A1B(A004);
                        directReplyService.A08 = A004;
                    }

                    @Override // X.C0RY
                    public void A0F(ProfiloUploadService profiloUploadService) {
                        C004902f A00 = C004902f.A00();
                        C02180Ae.A1B(A00);
                        profiloUploadService.A04 = A00;
                        AbstractC000600i A002 = AbstractC000600i.A00();
                        C02180Ae.A1B(A002);
                        profiloUploadService.A00 = A002;
                        AnonymousClass035 A003 = AnonymousClass035.A00();
                        C02180Ae.A1B(A003);
                        profiloUploadService.A03 = A003;
                        profiloUploadService.A01 = C41341tl.A00();
                        profiloUploadService.A02 = C41131tQ.A02();
                    }

                    @Override // X.C0RY
                    public void A0G(GcmListenerService gcmListenerService) {
                        gcmListenerService.A00 = C42111v7.A08();
                    }

                    @Override // X.C0RY
                    public void A0H(RegistrationIntentService registrationIntentService) {
                        AbstractC000600i A00 = AbstractC000600i.A00();
                        C02180Ae.A1B(A00);
                        registrationIntentService.A00 = A00;
                        C0EG A002 = C0EG.A00();
                        C02180Ae.A1B(A002);
                        registrationIntentService.A05 = A002;
                        C01B A003 = C01B.A00();
                        C02180Ae.A1B(A003);
                        registrationIntentService.A01 = A003;
                        C01Y c01y = C01Y.A01;
                        C02180Ae.A1B(c01y);
                        registrationIntentService.A06 = c01y;
                        registrationIntentService.A02 = C42041uv.A01();
                        C0CB A004 = C0CB.A00();
                        C02180Ae.A1B(A004);
                        registrationIntentService.A08 = A004;
                        registrationIntentService.A03 = C41131tQ.A02();
                        registrationIntentService.A04 = C41121tP.A00();
                    }

                    @Override // X.C0RY
                    public void A0I(SchedulerExperimentAlarmService schedulerExperimentAlarmService) {
                        C71153Va A00 = C71153Va.A00();
                        C02180Ae.A1B(A00);
                        schedulerExperimentAlarmService.A01 = A00;
                        schedulerExperimentAlarmService.A00 = C41871ue.A09();
                    }

                    @Override // X.C0RY
                    public void A0J(SchedulerExperimentJobService schedulerExperimentJobService) {
                        schedulerExperimentJobService.A02 = C41131tQ.A04();
                        schedulerExperimentJobService.A00 = C41871ue.A09();
                        C71173Vc A00 = C71173Vc.A00();
                        C02180Ae.A1B(A00);
                        schedulerExperimentJobService.A01 = A00;
                    }

                    @Override // X.C0RY
                    public void A0K(BackgroundMediaControlService backgroundMediaControlService) {
                        C03120Eg A00 = C03120Eg.A00();
                        C02180Ae.A1B(A00);
                        backgroundMediaControlService.A00 = A00;
                    }

                    @Override // X.C0RY
                    public void A0L(GcmFGService gcmFGService) {
                        C0ER A00 = C0ER.A00();
                        C02180Ae.A1B(A00);
                        ((C0IL) gcmFGService).A01 = A00;
                    }

                    @Override // X.C0RY
                    public void A0M(MDSyncService mDSyncService) {
                        C0ER A00 = C0ER.A00();
                        C02180Ae.A1B(A00);
                        ((C0IL) mDSyncService).A01 = A00;
                        C001200o c001200o = C001200o.A01;
                        C02180Ae.A1B(c001200o);
                        mDSyncService.A02 = c001200o;
                        mDSyncService.A08 = C41131tQ.A04();
                        C01B A002 = C01B.A00();
                        C02180Ae.A1B(A002);
                        mDSyncService.A01 = A002;
                        C0ER A003 = C0ER.A00();
                        C02180Ae.A1B(A003);
                        mDSyncService.A06 = A003;
                        C0EE A004 = C0EE.A00();
                        C02180Ae.A1B(A004);
                        mDSyncService.A04 = A004;
                        C41721uP A005 = C41721uP.A00();
                        C02180Ae.A1B(A005);
                        mDSyncService.A05 = A005;
                        mDSyncService.A03 = C41371to.A03();
                    }

                    @Override // X.C0RY
                    public void A0N(UnsentMessagesNetworkAvailableJob unsentMessagesNetworkAvailableJob) {
                        unsentMessagesNetworkAvailableJob.A05 = C41131tQ.A04();
                        unsentMessagesNetworkAvailableJob.A04 = C41371to.A08();
                        C00A c00a = C00A.A00;
                        C02180Ae.A1B(c00a);
                        unsentMessagesNetworkAvailableJob.A01 = c00a;
                        C00B A00 = C00B.A00();
                        C02180Ae.A1B(A00);
                        unsentMessagesNetworkAvailableJob.A03 = A00;
                        C05E A002 = C05E.A00();
                        C02180Ae.A1B(A002);
                        unsentMessagesNetworkAvailableJob.A02 = A002;
                    }

                    @Override // X.C0RY
                    public void A0O(C0IL c0il) {
                        C0ER A00 = C0ER.A00();
                        C02180Ae.A1B(A00);
                        c0il.A01 = A00;
                    }

                    @Override // X.C0RY
                    public void A0P(WebClientService webClientService) {
                        C0ER A00 = C0ER.A00();
                        C02180Ae.A1B(A00);
                        ((C0IL) webClientService).A01 = A00;
                        C01B A002 = C01B.A00();
                        C02180Ae.A1B(A002);
                        webClientService.A00 = A002;
                        C0EE A003 = C0EE.A00();
                        C02180Ae.A1B(A003);
                        webClientService.A01 = A003;
                        C41131tQ.A02();
                    }

                    @Override // X.C0RY
                    public void A0Q(ExceptionsUploadService exceptionsUploadService) {
                        if (C72713aT.A04 == null) {
                            synchronized (C72713aT.class) {
                                if (C72713aT.A04 == null) {
                                    C72713aT.A04 = new C72713aT(C001200o.A01, AnonymousClass011.A00(), C002601h.A00(), C72703aS.A00());
                                }
                            }
                        }
                        C72713aT c72713aT = C72713aT.A04;
                        C02180Ae.A1B(c72713aT);
                        exceptionsUploadService.A02 = c72713aT;
                        if (C72693aR.A08 == null) {
                            synchronized (C72693aR.class) {
                                if (C72693aR.A08 == null) {
                                    C72693aR.A08 = new C72693aR(C001200o.A01, C40001rG.A00(), AnonymousClass011.A00(), C01B.A00(), C000500h.A00(), C0E7.A00(), C002601h.A00(), C72703aS.A00());
                                }
                            }
                        }
                        C72693aR c72693aR = C72693aR.A08;
                        C02180Ae.A1B(c72693aR);
                        exceptionsUploadService.A01 = c72693aR;
                        if (C72733aV.A04 == null) {
                            synchronized (C72713aT.class) {
                                if (C72733aV.A04 == null) {
                                    C72733aV.A04 = new C72733aV(C001200o.A01, AnonymousClass011.A00(), C002601h.A00(), C72703aS.A00());
                                }
                            }
                        }
                        C72733aV c72733aV = C72733aV.A04;
                        C02180Ae.A1B(c72733aV);
                        exceptionsUploadService.A04 = c72733aV;
                        if (C72723aU.A04 == null) {
                            synchronized (C72723aU.class) {
                                if (C72723aU.A04 == null) {
                                    C72723aU.A04 = new C72723aU(C001200o.A01, AbstractC000600i.A00(), C0E7.A00(), C04000Ia.A00());
                                }
                            }
                        }
                        C72723aU c72723aU = C72723aU.A04;
                        C02180Ae.A1B(c72723aU);
                        exceptionsUploadService.A03 = c72723aU;
                        C002601h A00 = C002601h.A00();
                        C02180Ae.A1B(A00);
                        exceptionsUploadService.A00 = A00;
                    }

                    @Override // X.C0RY
                    public void A0R(SelfManagedConnectionService selfManagedConnectionService) {
                        C459824m A00 = C459824m.A00();
                        C02180Ae.A1B(A00);
                        selfManagedConnectionService.A00 = A00;
                    }

                    @Override // X.C0RY
                    public void A0S(VoiceFGService voiceFGService) {
                        C0ER A00 = C0ER.A00();
                        C02180Ae.A1B(A00);
                        ((C0IL) voiceFGService).A01 = A00;
                        voiceFGService.A00 = C41931uk.A04();
                    }
                };
                this.A00 = c0ry;
                return c0ry;
            }
            throw null;
        }
        return obj;
    }
}
