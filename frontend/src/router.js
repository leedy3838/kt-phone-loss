
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import PhonePhoneManagementManager from "./components/listers/PhonePhoneManagementCards"
import PhonePhoneManagementDetail from "./components/listers/PhonePhoneManagementDetail"

import LossLossManagementManager from "./components/listers/LossLossManagementCards"
import LossLossManagementDetail from "./components/listers/LossLossManagementDetail"


import UserUserManagementManager from "./components/listers/UserUserManagementCards"
import UserUserManagementDetail from "./components/listers/UserUserManagementDetail"

import ReportReportManagementManager from "./components/listers/ReportReportManagementCards"
import ReportReportManagementDetail from "./components/listers/ReportReportManagementDetail"

import RentalRentalManagementManager from "./components/listers/RentalRentalManagementCards"
import RentalRentalManagementDetail from "./components/listers/RentalRentalManagementDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/phones/phoneManagements',
                name: 'PhonePhoneManagementManager',
                component: PhonePhoneManagementManager
            },
            {
                path: '/phones/phoneManagements/:id',
                name: 'PhonePhoneManagementDetail',
                component: PhonePhoneManagementDetail
            },

            {
                path: '/losses/lossManagements',
                name: 'LossLossManagementManager',
                component: LossLossManagementManager
            },
            {
                path: '/losses/lossManagements/:id',
                name: 'LossLossManagementDetail',
                component: LossLossManagementDetail
            },


            {
                path: '/users/userManagements',
                name: 'UserUserManagementManager',
                component: UserUserManagementManager
            },
            {
                path: '/users/userManagements/:id',
                name: 'UserUserManagementDetail',
                component: UserUserManagementDetail
            },

            {
                path: '/reports/reportManagements',
                name: 'ReportReportManagementManager',
                component: ReportReportManagementManager
            },
            {
                path: '/reports/reportManagements/:id',
                name: 'ReportReportManagementDetail',
                component: ReportReportManagementDetail
            },

            {
                path: '/rentals/rentalManagements',
                name: 'RentalRentalManagementManager',
                component: RentalRentalManagementManager
            },
            {
                path: '/rentals/rentalManagements/:id',
                name: 'RentalRentalManagementDetail',
                component: RentalRentalManagementDetail
            },



    ]
})
