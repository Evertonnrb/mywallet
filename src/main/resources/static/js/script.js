console.log("load script")
$(function () {
    $('[rel="tooltip"]').tooltip()
    $('.js-currency').maskMoney({decimal: ',',thousands: '.',allowZero: false})
})