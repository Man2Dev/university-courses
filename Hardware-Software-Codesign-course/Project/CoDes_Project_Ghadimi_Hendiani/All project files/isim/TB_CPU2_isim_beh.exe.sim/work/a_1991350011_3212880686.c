/**********************************************************************/
/*   ____  ____                                                       */
/*  /   /\/   /                                                       */
/* /___/  \  /                                                        */
/* \   \   \/                                                       */
/*  \   \        Copyright (c) 2003-2009 Xilinx, Inc.                */
/*  /   /          All Right Reserved.                                 */
/* /---/   /\                                                         */
/* \   \  /  \                                                      */
/*  \___\/\___\                                                    */
/***********************************************************************/

/* This file is designed for use with ISim build 0x7708f090 */

#define XSI_HIDE_SYMBOL_SPEC true
#include "xsi.h"
#include <memory.h>
#ifdef __GNUC__
#include <stdlib.h>
#else
#include <malloc.h>
#define alloca _alloca
#endif
static const char *ng0 = "D:/Downloads/Uni Term 10/CoDes/Tamrin/CoDes_Project_Ghadimi_Hendiyani/PC.vhd";
extern char *IEEE_P_3620187407;

char *ieee_p_3620187407_sub_767668596_3965413181(char *, char *, char *, char *, char *, char *);


static void work_a_1991350011_3212880686_p_0(char *t0)
{
    char t16[16];
    char t17[16];
    unsigned char t1;
    char *t2;
    unsigned char t3;
    char *t4;
    char *t5;
    unsigned char t6;
    unsigned char t7;
    char *t8;
    unsigned char t9;
    unsigned char t10;
    char *t11;
    char *t12;
    char *t13;
    char *t14;
    char *t15;
    int t18;
    unsigned int t19;
    unsigned int t20;
    char *t21;
    char *t22;
    char *t23;
    char *t24;

LAB0:    xsi_set_current_line(21, ng0);
    t2 = (t0 + 992U);
    t3 = xsi_signal_has_event(t2);
    if (t3 == 1)
        goto LAB5;

LAB6:    t1 = (unsigned char)0;

LAB7:    if (t1 != 0)
        goto LAB2;

LAB4:
LAB3:    xsi_set_current_line(29, ng0);
    t2 = (t0 + 1672U);
    t4 = *((char **)t2);
    t1 = *((unsigned char *)t4);
    t3 = (t1 == (unsigned char)3);
    if (t3 != 0)
        goto LAB15;

LAB17:
LAB16:    t2 = (t0 + 3720);
    *((int *)t2) = 1;

LAB1:    return;
LAB2:    xsi_set_current_line(22, ng0);
    t4 = (t0 + 1192U);
    t8 = *((char **)t4);
    t9 = *((unsigned char *)t8);
    t10 = (t9 == (unsigned char)3);
    if (t10 != 0)
        goto LAB8;

LAB10:    t2 = (t0 + 1832U);
    t4 = *((char **)t2);
    t1 = *((unsigned char *)t4);
    t3 = (t1 == (unsigned char)3);
    if (t3 != 0)
        goto LAB11;

LAB12:
LAB9:    goto LAB3;

LAB5:    t4 = (t0 + 1032U);
    t5 = *((char **)t4);
    t6 = *((unsigned char *)t5);
    t7 = (t6 == (unsigned char)3);
    t1 = t7;
    goto LAB7;

LAB8:    xsi_set_current_line(23, ng0);
    t4 = (t0 + 1352U);
    t11 = *((char **)t4);
    t4 = (t0 + 3816);
    t12 = (t4 + 56U);
    t13 = *((char **)t12);
    t14 = (t13 + 56U);
    t15 = *((char **)t14);
    memcpy(t15, t11, 6U);
    xsi_driver_first_trans_fast(t4);
    goto LAB9;

LAB11:    xsi_set_current_line(25, ng0);
    t2 = (t0 + 1992U);
    t5 = *((char **)t2);
    t2 = (t0 + 6100U);
    t8 = (t0 + 6140);
    t12 = (t17 + 0U);
    t13 = (t12 + 0U);
    *((int *)t13) = 0;
    t13 = (t12 + 4U);
    *((int *)t13) = 5;
    t13 = (t12 + 8U);
    *((int *)t13) = 1;
    t18 = (5 - 0);
    t19 = (t18 * 1);
    t19 = (t19 + 1);
    t13 = (t12 + 12U);
    *((unsigned int *)t13) = t19;
    t13 = ieee_p_3620187407_sub_767668596_3965413181(IEEE_P_3620187407, t16, t5, t2, t8, t17);
    t14 = (t16 + 12U);
    t19 = *((unsigned int *)t14);
    t20 = (1U * t19);
    t6 = (6U != t20);
    if (t6 == 1)
        goto LAB13;

LAB14:    t15 = (t0 + 3816);
    t21 = (t15 + 56U);
    t22 = *((char **)t21);
    t23 = (t22 + 56U);
    t24 = *((char **)t23);
    memcpy(t24, t13, 6U);
    xsi_driver_first_trans_fast(t15);
    goto LAB9;

LAB13:    xsi_size_not_matching(6U, t20, 0);
    goto LAB14;

LAB15:    xsi_set_current_line(30, ng0);
    t2 = (t0 + 6146);
    t8 = (t0 + 3816);
    t11 = (t8 + 56U);
    t12 = *((char **)t11);
    t13 = (t12 + 56U);
    t14 = *((char **)t13);
    memcpy(t14, t2, 6U);
    xsi_driver_first_trans_fast(t8);
    goto LAB16;

}

static void work_a_1991350011_3212880686_p_1(char *t0)
{
    char *t1;
    char *t2;
    char *t3;
    char *t4;
    char *t5;
    char *t6;
    char *t7;

LAB0:    xsi_set_current_line(34, ng0);

LAB3:    t1 = (t0 + 1992U);
    t2 = *((char **)t1);
    t1 = (t0 + 3880);
    t3 = (t1 + 56U);
    t4 = *((char **)t3);
    t5 = (t4 + 56U);
    t6 = *((char **)t5);
    memcpy(t6, t2, 6U);
    xsi_driver_first_trans_fast_port(t1);

LAB2:    t7 = (t0 + 3736);
    *((int *)t7) = 1;

LAB1:    return;
LAB4:    goto LAB2;

}


extern void work_a_1991350011_3212880686_init()
{
	static char *pe[] = {(void *)work_a_1991350011_3212880686_p_0,(void *)work_a_1991350011_3212880686_p_1};
	xsi_register_didat("work_a_1991350011_3212880686", "isim/TB_CPU2_isim_beh.exe.sim/work/a_1991350011_3212880686.didat");
	xsi_register_executes(pe);
}
