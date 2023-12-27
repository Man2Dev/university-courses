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

#include "xsi.h"

struct XSI_INFO xsi_info;

char *IEEE_P_1242562249;
char *IEEE_P_3499444699;
char *STD_STANDARD;
char *IEEE_P_2592010699;
char *IEEE_P_3620187407;


int main(int argc, char **argv)
{
    xsi_init_design(argc, argv);
    xsi_register_info(&xsi_info);

    xsi_register_min_prec_unit(-12);
    ieee_p_2592010699_init();
    ieee_p_3499444699_init();
    ieee_p_3620187407_init();
    ieee_p_1242562249_init();
    work_a_1037769429_3212880686_init();
    work_a_2991416129_3212880686_init();
    work_a_2096391741_3212880686_init();
    work_a_1991350011_3212880686_init();
    work_a_3219856015_3212880686_init();
    work_a_2003269818_3212880686_init();
    work_a_1657022548_3212880686_init();
    work_a_2615964831_3212880686_init();
    work_a_3395850990_3212880686_init();
    work_a_4121324609_3212880686_init();
    work_a_3105827084_3212880686_init();
    work_a_0953748312_3212880686_init();
    work_a_0832606739_3212880686_init();
    work_a_2750190074_3212880686_init();
    work_a_0992381938_3212880686_init();
    work_a_3877310806_3212880686_init();


    xsi_register_tops("work_a_3877310806_3212880686");

    IEEE_P_1242562249 = xsi_get_engine_memory("ieee_p_1242562249");
    IEEE_P_3499444699 = xsi_get_engine_memory("ieee_p_3499444699");
    STD_STANDARD = xsi_get_engine_memory("std_standard");
    IEEE_P_2592010699 = xsi_get_engine_memory("ieee_p_2592010699");
    xsi_register_ieee_std_logic_1164(IEEE_P_2592010699);
    IEEE_P_3620187407 = xsi_get_engine_memory("ieee_p_3620187407");

    return xsi_run_simulation(argc, argv);

}
