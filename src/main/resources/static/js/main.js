$(document).on("click", ".open-dialog", function(){
    var id  = $(this).data('id');
    var name  = $(this).data('name');
    var country  = $(this).data('capital');
    //var capital  = "test";
    $(".modal-body #id").val(id);
    $(".modal-body #name").val(name);
    $(".modal-body #capital").val(country);



});